package fr.mastersid.rekkas.stackoverflow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionsViewModel @Inject constructor (
    private val questionsRepository: QuestionsRepository
) : ViewModel() {

    //LiveData
    private val _questionsList: MutableLiveData<List<Questions>> = MutableLiveData(emptyList())
    val questions: LiveData<List<Questions>> get() = _questionsList

    private val viewModelScope = MainScope()

    fun updateQuestionsList() {
        viewModelScope.launch(Dispatchers.IO) {
            _questionsList.postValue(questionsRepository.getQuestionsList())
        }
    }
}