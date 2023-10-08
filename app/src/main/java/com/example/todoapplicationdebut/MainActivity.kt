package com.example.todoapplicationdebut

//Import the ViewBonding
import com.example.todoapplicationdebut.databinding.ActivityMainBinding
//Import the Intent
import android.content.Intent
import android.os.Bundle
import android.view.View
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

class MainActivity : ComponentActivity() {

    //Declare the binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoApplicationDebutTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Intro(MyTitle.toString())
                }
            }
        }

        //Initialize the ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

                    // -- Alternative way, not using binding

                    // Set the view content so the layout loads.
                    //setContentView(R.layout.activity_main)

                    // Find the button by its ID
                    //val buttonSwitch = findViewById<View>(R.id.buttonSwitch)

                    //--

        // Set a click listener for the button using the binding
        binding.buttonSwitch.setOnClickListener {
            // Create an Intent to start the UserActivity
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
    }
}
val MyTitle = "ToDo Application"

@Composable
fun Intro(name: String) {

}

@Preview(showBackground = true)
@Composable
fun IntroPreview() {
    ToDoApplicationDebutTheme {
        Intro(MyTitle.toString())
    }
}

