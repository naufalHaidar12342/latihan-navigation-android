package xyz.heydarrn.latihannavigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import xyz.heydarrn.latihannavigationcomponent.databinding.FragmentDetailOfCategoryBinding

class DetailOfCategoryFragment : Fragment() {
    private var _binding: FragmentDetailOfCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailOfCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val name=arguments?.getString(CategoryFragment.EXTRA_NAME)
//        val description=arguments?.getLong(CategoryFragment.EXTRA_STOCK)
//
//        binding.textViewCategoryDescription.text="Stock : $description"
//
//        binding.textViewCategoryName.text=name

        val dataName=DetailOfCategoryFragmentArgs.fromBundle(arguments as Bundle).namaProduk
        val dataItemStock=DetailOfCategoryFragmentArgs.fromBundle(arguments as Bundle).stokProduk

        binding.textViewCategoryName.text=dataName

        binding.textViewCategoryDescription.text="Stok : $dataItemStock"

        binding.buttonBackHome.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_detailOfCategoryFragment_to_homeFragment)
        )

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}


