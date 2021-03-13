package com.example.kotlinbeginnersubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                val intent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}