package com.example.uasdiky

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Motocycle(
    val name: String,
    val description: String,
    val photo: Int,
    val sound: String
) : Parcelable
