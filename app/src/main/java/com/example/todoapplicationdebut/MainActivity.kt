package com.example.todoapplicationdebut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


//When implementing Fragments, you use AppCompatActivity
//Instead of ComponentActivity because FragmentActivities
//Are a subclass of AppCompatActivity.
//ComponentActivity does not support the operating of fragments
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Load the MainFragment into the fragment container
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerActivityMain, MainFragment())
            .commit()
    }
}
