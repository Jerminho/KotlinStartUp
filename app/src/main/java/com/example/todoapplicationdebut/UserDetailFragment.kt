package com.example.todoapplicationdebut
import com.example.todoapplicationdebut.databinding.FragmentUserDetailBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class UserDetailFragment : Fragment() {

    private lateinit var binding: FragmentUserDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentUserDetailBinding.inflate(inflater, container, false)
        val view = binding.root

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

        // Add an OnClickListener to the Switch
        binding.switchBoolean.setOnCheckedChangeListener { _, isChecked ->
            val text = if (isChecked) "Active" else "Inactive"
            binding.switchBoolean.text = text

            // Update the isActive property of the User object
            user.isActive = isChecked
        }
        //Return the View
        return view
    }
}