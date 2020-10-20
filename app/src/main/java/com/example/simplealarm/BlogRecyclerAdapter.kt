package com.example.simplealarm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplealarm.models.BlogPost
import kotlinx.android.synthetic.main.activity_main3.view.*

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> (

) {
    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_main3, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is BlogViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    fun submitList(blogList: List<BlogPost>) {
        items = blogList
    }

    class BlogViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val timeAlarm = itemView.time_alarm
        var textAlarm = itemView.text_alarm

        fun bind(blogPost: BlogPost) {
            timeAlarm.setText(blogPost.title)
            textAlarm.setText(blogPost.alarmText)
        }
    }
}