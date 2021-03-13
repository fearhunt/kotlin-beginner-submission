package com.example.kotlinbeginnersubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNBATeams: RecyclerView
    private var list: ArrayList<NBATeam> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNBATeams = findViewById(R.id.rv_nba_teams)
        rvNBATeams.setHasFixedSize(true)

        list.addAll(NBATeamsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNBATeams.layoutManager = LinearLayoutManager(this)
        val listNBATeamAdapter = ListNBATeamAdapter(list)
        rvNBATeams.adapter = listNBATeamAdapter
    }
}