package com.ralphdugue.characterworkshop.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import com.ralphdugue.characterworkshop.R
import com.ralphdugue.characterworkshop.ui.composables.ProfilePage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilePage()
        }
    }
}