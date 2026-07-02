package com.example.testing.pages

import android.view.LayoutInflater
import android.widget.TextView
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.testing.Profile
import com.example.testing.R

@Preview
@Composable
 fun InfoPage() {
     val profile = Profile("Pranish Chaulagain", "pranish@gmail.com", 2, "rr")
    AndroidView(
        factory = {context ->
            LayoutInflater.from(context)
                .inflate(R.layout.info_page, null)
        },
        update = { view ->
            view.findViewById<TextView>(R.id.tvName).text = profile.name
        }
    )
}