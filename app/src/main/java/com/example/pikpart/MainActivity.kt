package com.example.pikpart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pikpart.adapter.BannerAdapter
import com.example.pikpart.adapter.OfferProductAdapter
import com.example.pikpart.adapter.ProductBannerAdapter
import com.example.pikpart.databinding.ActivityMainBinding
import com.example.pikpart.model.Banner
import com.example.pikpart.model.OfferOnAmc
import com.example.pikpart.model.PikPartRequest
import com.example.pikpart.model.ProductArray
import com.example.pikpart.viewmodel.PikPartViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var viewModel: PikPartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        supportActionBar?.hide()
        viewModel = ViewModelProvider(this)[PikPartViewModel::class.java]
        viewModel.getPikPartObserver().observe(this) {
            mBinding.progressBar.visibility = View.GONE
            if (it != null) {
                Log.d("asasas", it.toString())
                it.responseResult?.result?.data?.bannerList?.let { it1 -> initBannerAdapter(it1) }
                initProductArrayAdapter(it.responseResult?.result?.data?.product?.productArray)
                offerProductAdapter(it.responseResult?.result?.data?.offerOnAmc)
            } else {
                Log.d("asasas", "No Data Found")
            }
        }
        initViewModel()
    }

    private fun initBannerAdapter(item: List<Banner>) {
        mBinding.bannerRv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = BannerAdapter()
        mBinding.bannerRv.adapter = adapter
        adapter.submitList(item)
    }
    private fun initProductArrayAdapter(item: List<ProductArray>?) {
        mBinding.productBannerRv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = ProductBannerAdapter()
        mBinding.productBannerRv.adapter = adapter
        adapter.submitList(item)
    }
    private fun offerProductAdapter(item: List<OfferOnAmc>?) {
        mBinding.offerRv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = OfferProductAdapter()
        mBinding.offerRv.adapter = adapter
        adapter.submitList(item)
    }

    private fun initViewModel() {
        val hashMap = HashMap<String, PikPartRequest>()
        hashMap["objectHash"] = PikPartRequest()
        viewModel.apiCall(hashMap)

    }
}