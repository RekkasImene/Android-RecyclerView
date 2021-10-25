package fr.mastersid.rekkas.stackoverflow

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestionsViewHolder ( view : View) : RecyclerView. ViewHolder ( view ) {
    val title : TextView = view . findViewById (R.id.title_item)
    val answerCount : TextView = view . findViewById (R.id.answerCount_item)
}