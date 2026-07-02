package com.example.testing

import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.testing.R

@Preview
@Composable
 fun InfoPage() {
     val newProfile = Profile("Pranish Chaulagain", "pranish@gmail.com" ,12, "My name is Pranish Chaulagain. This is my about Page")
    Log.d("InfoPage", newProfile.name)
    AndroidView(
        modifier = Modifier
        .fillMaxSize(),
        factory = {context ->
            LayoutInflater.from(context)
                .inflate(R.layout.info_page, null)

        },
        update = { view ->
            view.findViewById<TextView>(R.id.tvName).text = newProfile.name
        }
    )
}