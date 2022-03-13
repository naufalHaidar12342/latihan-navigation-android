package xyz.heydarrn.latihannavigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        val name=arguments?.getString(CategoryFragment.EXTRA_NAME)
        val description=arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        binding.textViewCategoryDescription.text="Stock : $description"
        Log.d("stok kiriman", binding.textViewCategoryDescription.text.toString())
        binding.textViewCategoryName.text=name
        Log.d("nama kiriman", binding.textViewCategoryName.text.toString())
//        val dataName=DetailOfCategoryFragmentArgs.fromBundle(arguments as Bundle).namaProduk
//        val dataItemStock=DetailOfCategoryFragmentArgs.fromBundle(arguments as Bundle).stokProduk
//
//        binding.textViewCategoryName.text=dataName
//        Log.d("nama kiriman", binding.textViewCategoryName.text.toString())
//        binding.textViewCategoryDescription.text="Stok : $dataItemStock"
//        Log.d("stok kiriman", binding.textViewCategoryDescription.text.toString())
    }
    companion object {
        val EXTRA_NAME="category name goes here"
        val EXTRA_STOCK="stock of item X goes here"
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}