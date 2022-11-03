package com.example.johndeere

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.johndeere.databinding.FragmentProfileBinding

class Profile : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val changePass = view.findViewById<Button>(R.id.changePass_button)
        val logOut = view.findViewById<Button>(R.id.logOut_button)

        changePass.setOnClickListener{
            view.findNavController().navigate(R.id.action_profile_frag_to_changePassword_frag)
        }

        logOut.setOnClickListener{
            view.findNavController().navigate(R.id.action_profile_frag_to_homePage_frag)
        }
    }
}