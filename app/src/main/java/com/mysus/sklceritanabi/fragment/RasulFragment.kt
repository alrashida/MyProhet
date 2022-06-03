package com.mysus.sklceritanabi.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mysus.sklceritanabi.Adapter.AdapterRasul
import com.mysus.sklceritanabi.R
import com.mysus.sklceritanabi.databinding.FragmentRasulBinding
import com.mysus.sklceritanabi.databinding.ItemRecyclerRasulBinding
import com.mysus.sklceritanabi.model.ResponsePropehtItem
import com.mysus.sklceritanabi.network.RetrofitService
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class RasulFragment : Fragment() {

    private lateinit var binding: FragmentRasulBinding
    private lateinit var adapterRasul: AdapterRasul
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRasulBinding.inflate(inflater,container,false)
        adapterRasul = AdapterRasul()
        binding.rvRasul.adapter = adapterRasul
        binding.rvRasul.setHasFixedSize(true)
        binding.rvRasul.layoutManager = GridLayoutManager(context,2)


        val call = RetrofitService.getService().getDatarasul()
        call.enqueue(object : retrofit2.Callback<List<ResponsePropehtItem>>{
            override fun onResponse(
                call: Call<List<ResponsePropehtItem>>,
                response: Response<List<ResponsePropehtItem>>
            ) {
                val listdata = response.body()!!
                listdata.let { it.let { it1 -> adapterRasul.adddatarasul(it) } }
            }

            override fun onFailure(call: Call<List<ResponsePropehtItem>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

        return binding.root

    }




}
