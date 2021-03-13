package com.example.kotlinbeginnersubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNBATeamAdapter(val listNBATeam: ArrayList<NBATeam>) : RecyclerView.Adapter<ListNBATeamAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_nba_teams, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, index: Int) {
        val nbaTeam = listNBATeam[index]

        Glide.with(holder.itemView.context)
                .load(nbaTeam.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)

        holder.tvName.text = nbaTeam.name
//        holder.tvDetail.text = nbaTeam.detail
//        holder.tvWins.text = nbaTeam.wins
//        holder.tvLoses.text = nbaTeam.loses
//        holder.tvTwitter.text = nbaTeam.twitter
    }

    override fun getItemCount(): Int {
        return listNBATeam.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
//        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
//        var tvWins: TextView = itemView.findViewById(R.id.tv_item_wins)
//        var tvLoses: TextView = itemView.findViewById(R.id.tv_item_loses)
//        var tvTwitter: TextView = itemView.findViewById(R.id.tv_item_twitter)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}