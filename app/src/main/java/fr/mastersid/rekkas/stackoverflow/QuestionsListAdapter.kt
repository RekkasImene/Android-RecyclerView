package fr.mastersid.rekkas.stackoverflow

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter


class QuestionsListAdapter : ListAdapter< Questions,QuestionsViewHolder >
    (Questions.DiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionsViewHolder {
            val view = LayoutInflater . from ( parent . context )
                . inflate (R. layout . questions_item , parent , false )
            return QuestionsViewHolder( view )
    }



    override fun onBindViewHolder(holder: QuestionsViewHolder, position: Int) {
        val item = getItem(position)
        Log.d("onBindViewHolder", " ${item.title} ")
        holder.title.text = item.title
        holder.answerCount.text = item.answerCount.toString()

    }


}