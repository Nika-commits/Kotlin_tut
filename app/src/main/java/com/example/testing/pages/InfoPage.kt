package com.example.testing.pages

import android.view.LayoutInflater
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.testing.R

@Preview
@Composable
 fun InfoPage() {
    AndroidView(
        factory = {context ->
            LayoutInflater.from(context)
                .inflate(R.layout.info_page, null)
        }
    )
}