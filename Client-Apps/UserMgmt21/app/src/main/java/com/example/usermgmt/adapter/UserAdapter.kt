package com.example.usermgmt.adapter

import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.usermgmt.R
import com.example.usermgmt.entity.User


class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    var users : List<User> = ArrayList()

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var username : TextView = itemView.findViewById(R.id.cardusername)
        var password :TextView = itemView.findViewById(R.id.cardpassword)
        var cardView : CardView = itemView.findViewById(R.id.cardview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var user : User = users[position]
        holder.username.text = user.username
        holder.password.text = user.password
    }

    override fun getItemCount(): Int {
        return users.size
    }

    fun setDBUsers(users : List<User>){
        this.users = users
        notifyDataSetChanged()
    }


}