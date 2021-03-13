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
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)

        holder.tvName.text = nbaTeam.name
        holder.tvDetail.text = nbaTeam.detail
        holder.tvTwitter.text = nbaTeam.twitter
        holder.btnDetail.setOnClickListener {
            val activity = holder.itemView.context as Activity
            val intent = Intent(activity, NBATeamDetailActivity::class.java)
//            intent.putExtra(listBicycle)[position]
//            startActivity(intent)
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

//    override fun onClick(v: View?) {
//        if (v?.id == R.id.button_details) {
////            println("coba")
////            val moveWithDataIntent = Intent(this@ListNBATeamAdapter, NBATeamDetailActivity::class.java)
////            moveWithDataIntent.putExtra(NBATeamDetailActivity.EXTRA_NAME, "DicodingAcademy Boy")
////            moveWithDataIntent.putExtra(NBATeamDetailActivity.EXTRA_AGE, 5)
////            startActivity(moveWithDataIntent)
//        }
//    }

}