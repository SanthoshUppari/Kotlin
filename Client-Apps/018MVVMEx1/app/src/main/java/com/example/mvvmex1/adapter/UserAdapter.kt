package com.example.mvvmex1.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmex1.R
import com.example.mvvmex1.entity.User

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    var users : List<User> = ArrayList()

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title : TextView = itemView.findViewById(R.id.username)
        var pwd : TextView = itemView.findViewById(R.id.pwd)
        var cardView : CardView = itemView.findViewById(R.id.cardview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var user : User = users[position]
        holder.title.text = user.userName
        holder.pwd.text = user.pwd
    }

    override fun getItemCount(): Int {
        return users.size
    }

    fun setDBUsers(users : List<User>){
        Log.d(" users count2 ", users.size.toString())
        this.users = users
        notifyDataSetChanged()
    }

}