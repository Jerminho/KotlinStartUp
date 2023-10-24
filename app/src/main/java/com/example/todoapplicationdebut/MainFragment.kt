package com.example.todoapplicationdebut

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.todoapplicationdebut.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //Initialize the ViewBinding
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root

        // Set a click listener for the button using the binding
        binding.buttonSwitch.setOnClickListener {

            val userFragment = MainFragment() // Create a new instance of the UserFragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerMain, userFragment) // Replace the current fragment with the UserFragment
                .commit()

            findNavController().navigate(R.id.action_mainFragment_to_userActivity)
        }
        return view
        }
}