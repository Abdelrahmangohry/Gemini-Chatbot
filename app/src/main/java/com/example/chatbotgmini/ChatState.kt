package com.example.chatbotgmini

import android.graphics.Bitmap
import com.example.chatbotgmini.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)