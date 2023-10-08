package com.example.todoapplicationdebut

import com.example.todoapplicationdebut.User
import com.example.todoapplicationdebut.databinding.ActivityUserBinding
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapplicationdebut.ui.theme.ToDoApplicationDebutTheme
class UserActivity : ComponentActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val user = User(
            id = 1,
            firstName = "Pierre",
            lastName = "Njiné Happy",
            password = "MerciNdeko",
            isActive = false
        )

        // Access properties of the User object using ViewBinding
        binding.textViewFirstName.text = user.firstName
        binding.textViewLastName.text = user.lastName
        binding.switchBoolean.isChecked = user.isActive

        // Remove this line to avoid programmatic text setting
        // binding.switchBoolean.text = "Active" // Remove this line

        // Add an OnClickListener to the Switch
        binding.switchBoolean.setOnCheckedChangeListener { _, isChecked ->
            val text = if (isChecked) "Active" else "Inactive"
            binding.switchBoolean.text = text

            // Update the isActive property of the User object
            user.isActive = isChecked
        }


    }
}



