package fr.mastersid.rekkas.stackoverflow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint

import fr.mastersid.rekkas.stackoverflow.databinding.FragmentQuestionsBinding

@AndroidEntryPoint
class QuestionsFragment : Fragment(R.layout.fragment_questions) {

    private lateinit var _binding : FragmentQuestionsBinding
    private val questionsModel: QuestionsViewModel by viewModels()
    override fun onViewCreated ( view : View , savedInstanceState : Bundle ?) {
        super . onViewCreated (view , savedInstanceState )
        _binding = FragmentQuestionsBinding.bind(view)


        val questionsListAdapter = QuestionsListAdapter ()
        _binding . recyclerView . apply {
            setHasFixedSize ( true )
            layoutManager = LinearLayoutManager ( context )
            adapter = questionsListAdapter
            questionsModel.updateQuestionsList()
        }
        _binding.swipeRefresh.setOnRefreshListener {
            questionsModel.updateQuestionsList()
        }

        questionsModel.questions.observe(viewLifecycleOwner) {
            _binding.swipeRefresh.isRefreshing = false
            questionsListAdapter.submitList(it)
        }
    }

}