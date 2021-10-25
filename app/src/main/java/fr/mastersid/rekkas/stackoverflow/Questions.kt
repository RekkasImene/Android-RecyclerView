package fr.mastersid.rekkas.stackoverflow

import androidx.recyclerview.widget.DiffUtil

data class Questions(val title:String, val answerCount:Int) {

    class DiffCallback : DiffUtil. ItemCallback < Questions>() {
        override fun areItemsTheSame ( oldItem : Questions , newItem : Questions ): Boolean {
            return oldItem . title == newItem . title
        }
        override fun areContentsTheSame ( oldItem : Questions , newItem : Questions ): Boolean {
            return oldItem . title == newItem . title && oldItem . answerCount ==
                    newItem . answerCount
        }
    }
}