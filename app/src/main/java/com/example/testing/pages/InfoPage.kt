package com.example.testing.pages

import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
            view.findViewById<TextView>(R.id.tvEmail).text = profile.email
            
            view.findViewById<Button>(R.id.button1).setOnClickListener {
                Toast.makeText(view.context, "Button Clicked", Toast.LENGTH_LONG).show()
                profile.name = "New Name"
                view.findViewById<TextView>(R.id.tvName).text = profile.name
            }
        }
    )

}