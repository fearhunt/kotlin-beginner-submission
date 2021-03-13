package com.example.kotlinbeginnersubmission

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNBATeamAdapter(private val listNBATeam: ArrayList<NBATeam>) : RecyclerView.Adapter<ListNBATeamAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_nba_teams, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, index: Int) {
        val nbaTeam = listNBATeam[index]

        Glide.with(holder.itemView.context)
                .load(nbaTeam.photo)
                .apply(RequestOptions().override(64, 64))
                .into(holder.imgPhoto)

        holder.tvName.text = nbaTeam.name
        holder.tvDetail.text = nbaTeam.detail
        holder.tvTwitter.text = nbaTeam.twitter
        holder.btnDetail.setOnClickListener {
            val context = holder.itemView.context

            val intent = Intent(context, NBATeamDetailActivity::class.java)
            intent.putExtra(NBATeamDetailActivity.EXTRA_NBA_TEAM_NAME, nbaTeam.name)
            intent.putExtra(NBATeamDetailActivity.EXTRA_NBA_TEAM_DETAIL, nbaTeam.detail)
            intent.putExtra(NBATeamDetailActivity.EXTRA_NBA_TEAM_WINS, nbaTeam.wins)
            intent.putExtra(NBATeamDetailActivity.EXTRA_NBA_TEAM_LOSES, nbaTeam.loses)
            intent.putExtra(NBATeamDetailActivity.EXTRA_NBA_TEAM_TWITTER, nbaTeam.twitter)
            intent.putExtra(NBATeamDetailActivity.EXTRA_NBA_TEAM_PHOTO, nbaTeam.photo)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listNBATeam.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvTwitter: TextView = itemView.findViewById(R.id.tv_item_twitter)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnDetail: Button = itemView.findViewById(R.id.button_details)
    }
}