package com.example.kotlinbeginnersubmission

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NBATeamDetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtPhoneNumber: EditText
    private lateinit var btnShare: Button

    companion object {
        const val NBA_TEAM_NAME = "nba_team_name"
        const val NBA_TEAM_DETAIL = "nba_team_detail"
        const val NBA_TEAM_TWITTER = "nba_team_twitter"
        const val NBA_TEAM_WINS = "nba_team_wins"
        const val NBA_TEAM_LOSES = "nba_team_loses"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nba_team_detail)

        val tvNBATeamName: TextView = findViewById(R.id.tv_item_name)
        val tvNBATeamDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvNBATeamTwitter: TextView = findViewById(R.id.tv_item_twitter)
        val tvNBATeamWins: TextView = findViewById(R.id.tv_item_wins)
        val tvNBATeamLoses: TextView = findViewById(R.id.tv_item_loses)

        val name = intent.getStringExtra(NBA_TEAM_NAME)
        val detail = intent.getStringExtra(NBA_TEAM_DETAIL)
        val twitter = intent.getStringExtra(NBA_TEAM_TWITTER)
        val wins = intent.getStringExtra(NBA_TEAM_WINS)
        val loses = intent.getStringExtra(NBA_TEAM_LOSES)

        tvNBATeamName.text = name
        tvNBATeamDetail.text = detail
        tvNBATeamTwitter.text = twitter
        tvNBATeamWins.text = wins
        tvNBATeamLoses.text = loses

        edtPhoneNumber = findViewById(R.id.edt_phone_number)
        btnShare = findViewById(R.id.button_share)

        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val inputPhoneNumber = edtPhoneNumber.text.toString().trim()

            var isEmptyFields = false

            when {
                inputPhoneNumber.isEmpty() -> {
                    isEmptyFields = true
                    edtPhoneNumber.error = "Nomor handphone tidak boleh kosong"
                }
            }

            if (!isEmptyFields) {
                val uri: Uri = Uri.parse("https://www.api.whatsapp.com/send?phone=$inputPhoneNumber")

                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        }
    }
}