package com.example.todoapplicationdebut


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//When implementing Fragments, you use AppCompatActivity
//Instead of ComponentActivity because FragmentActivities
//Are a subclass of AppCompatActivity.
//ComponentActivity does not support the operating of fragments
class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        // Load the UserDetailFragment into the fragment container
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerActivityUser, UserDetailFragment())
            .commit()
    }
}



