package fr.mastersid.rekkas.stackoverflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import fr.mastersid.rekkas.stackoverflow.databinding.QuestionsMainBinding

@AndroidEntryPoint
class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: QuestionsMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuestionsMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val questionsFragment = QuestionsFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, questionsFragment)
            commit()
        }
    }
}