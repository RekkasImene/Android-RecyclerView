package fr.mastersid.rekkas.stackoverflow

import javax.inject.Inject

class QuestionsRepository
@Inject
constructor(
    private val questionsDummyBackend: QuestionsDummyBackend
) {
    suspend fun getQuestionsList(): List<Questions>{
        return questionsDummyBackend.getQuestionsList()
    }
}