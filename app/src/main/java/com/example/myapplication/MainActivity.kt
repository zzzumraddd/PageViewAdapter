package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.theme.Item
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mutableList = mutableListOf<Item>()
        mutableList.add(Item(R.drawable.img, "hiii"))
        mutableList.add(Item(R.drawable.sleeepy, "sleeping"))
        mutableList.add(Item(R.drawable.eat, "eating"))
    }
}
