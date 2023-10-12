package com.example.dzikri

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val email:String,
    val password:String
):Parcelable
