package xyz.heydarrn.latihannavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import xyz.heydarrn.latihannavigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding:FragmentHomeBinding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            buttonCategory.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
            )

            buttonProfile.setOnClickListener {
                it.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
            }


        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}