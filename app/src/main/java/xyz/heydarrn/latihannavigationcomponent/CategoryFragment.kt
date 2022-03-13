package xyz.heydarrn.latihannavigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import xyz.heydarrn.latihannavigationcomponent.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    companion object {
        val EXTRA_NAME="category_name_goes_here"
        val EXTRA_STOCK="stock_of_item_X_goes_here"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_category, container, false)
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLifestyleCategory.setOnClickListener { bindCategoryButton->
//            val mBundle=Bundle()
//            mBundle.putString(EXTRA_NAME,"Lifestyle")
//            mBundle.putLong(EXTRA_STOCK,7)
//            bindCategoryButton.findNavController().navigate(R.id.action_categoryFragment_to_detailOfCategoryFragment,mBundle)

            val sendSafeArgs=CategoryFragmentDirections.actionCategoryFragmentToDetailOfCategoryFragment("Lifestyle",7)
            bindCategoryButton.findNavController().navigate(sendSafeArgs)
        }
        binding.imgAndroid.setImageResource(R.drawable.ic_baseline_android_24)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}