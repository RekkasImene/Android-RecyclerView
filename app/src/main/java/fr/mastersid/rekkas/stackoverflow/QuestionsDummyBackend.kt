package fr.mastersid.rekkas.stackoverflow

import kotlinx.coroutines.delay
import javax.inject.Inject

class QuestionsDummyBackend @Inject constructor() {

    suspend fun getQuestionsList(): List<Questions> {
        delay(500)
        return listOf(
            Questions("Why My android studio does not work", 5),
            Questions("Kotlin Bug", 2),
            Questions("Dagger Hilt Question", 10),
            Questions("RxJava Or Coroutines", 6),
        )
    }

}