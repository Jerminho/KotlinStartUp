package com.example.todoapplicationdebut

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoapplicationdebut.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        //Initialize the ViewBinding
        binding = FragmentMainBinding.inflate(inflater, container, false)
        var view = binding.root

        // -- Alternative way, not using binding

        // Set the view content so the layout loads.
        //setContentView(R.layout.activity_main)

        // Find the button by its ID
        //val buttonSwitch = findViewById<View>(R.id.buttonSwitch)

        //--

        // Set a click listener for the button using the binding
        binding.buttonSwitch.setOnClickListener {
            // Create an Intent to start the UserActivity,
            // Add (RequireActivity() to return the activity needed )
            // Using "Activity" might work too, but it doesn't handle
            //NULL values whereas RequireActivity() does.

            val UserFragment = MainFragment() // Create a new instance of the UserFragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerMain, UserFragment) // Replace the current fragment with the UserFragment
                .commit()

            val intent = Intent(requireActivity(), UserActivity::class.java)
            startActivity(intent)
        }
        return view
        }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}