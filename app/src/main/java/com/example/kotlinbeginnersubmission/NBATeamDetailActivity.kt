package com.example.kotlinbeginnersubmission

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NBATeamDetailActivity : AppCompatActivity() {
    private lateinit var edtPhoneNumber: EditText
    private lateinit var btnShare: Button

    companion object {
        const val EXTRA_NBA_TEAM_NAME = "extra_nba_team_name"
        const val EXTRA_NBA_TEAM_DETAIL = "extra_nba_team_detail"
        const val EXTRA_NBA_TEAM_TWITTER = "extra_nba_team_twitter"
        const val EXTRA_NBA_TEAM_WINS = "extra_nba_team_wins"
        const val EXTRA_NBA_TEAM_LOSES = "extra_nba_team_loses"
        const val EXTRA_NBA_TEAM_PHOTO = "extra_nba_team_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nba_team_detail)

        supportActionBar?.title = "NBA Team Detail"

        val tvNBATeamName: TextView = findViewById(R.id.tv_item_name)
        val tvNBATeamDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvNBATeamTwitter: TextView = findViewById(R.id.tv_item_twitter)
        val tvNBATeamWins: TextView = findViewById(R.id.tv_item_wins)
        val tvNBATeamLoses: TextView = findViewById(R.id.tv_item_loses)
        val ivNBATeamPhoto: ImageView = findViewById(R.id.iv_team_photo)

        val name = intent.getStringExtra(EXTRA_NBA_TEAM_NAME)
        val detail = intent.getStringExtra(EXTRA_NBA_TEAM_DETAIL)
        val twitter = intent.getStringExtra(EXTRA_NBA_TEAM_TWITTER)
        val wins = intent.getStringExtra(EXTRA_NBA_TEAM_WINS)
        val loses = intent.getStringExtra(EXTRA_NBA_TEAM_LOSES)
        val photo = intent.getIntExtra(EXTRA_NBA_TEAM_PHOTO, 0)

        tvNBATeamName.text = name
        tvNBATeamDetail.text = detail
        tvNBATeamTwitter.text = twitter
        tvNBATeamWins.text = wins
        tvNBATeamLoses.text = loses
        ivNBATeamPhoto.setImageResource(photo)

        edtPhoneNumber = findViewById(R.id.edt_phone_number)

        val btnShare: Button = findViewById(R.id.button_share)

        btnShare.setOnClickListener {
            val inputPhoneNumber = edtPhoneNumber.text.toString().trim()

            var isEmptyFields = false

            when {
                inputPhoneNumber.isEmpty() -> {
                    isEmptyFields = true
                    edtPhoneNumber.error = "Nomor handphone tidak boleh kosong"
                }
            }

            if (!isEmptyFields) {
                val message = "Hello there! Checkout this awesome NBA Team called *$name*, they currently have records with *$wins wins* and *$loses loses*. You can also see their awesome other activities on Twitter $twitter"

                val uri: Uri = Uri.parse("https://api.whatsapp.com/send?phone=$inputPhoneNumber&text=$message")

                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        }
    }
}