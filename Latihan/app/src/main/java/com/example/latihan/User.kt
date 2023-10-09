package com.example.latihan

import android.os.Parcelable
import android.provider.ContactsContract.CommonDataKinds.Email
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val username:String,
    val email: String,
    val password:String
):Parcelable
