package com.example.kotlinbeginnersubmission

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class NBATeam (
    var name: String = "",
    var detail: String = "",
    var wins: String = "",
    var loses: String = "",
    var twitter: String = "",
    var photo: Int = 0
)