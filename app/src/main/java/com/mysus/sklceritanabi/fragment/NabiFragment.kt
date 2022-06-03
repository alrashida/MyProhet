package com.mysus.sklceritanabi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mysus.sklceritanabi.Adapter.AdapterRasul
import com.mysus.sklceritanabi.R
import com.mysus.sklceritanabi.databinding.FragmentNabiBinding
import com.mysus.sklceritanabi.model.ResponsePropehtItem
import com.mysus.sklceritanabi.network.RetrofitService
import retrofit2.Call
import retrofit2.Response


class NabiFragment : Fragment() {

    private lateinit var binding: FragmentNabiBinding
    private lateinit var adapter: AdapterRasul

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNabiBinding.inflate(inflater,container,false)

       adapter = AdapterRasul()
        binding.gridviewnabi.adapter = adapter
        binding.gridviewnabi.setHasFixedSize(true)
        binding.gridviewnabi.layoutManager = GridLayoutManager(context,2)
        val call = RetrofitService.getService().getDataNabi()

        call.enqueue(object : retrofit2.Callback<List<ResponsePropehtItem>>{
            override fun onResponse(
                call: Call<List<ResponsePropehtItem>>,
                response: Response<List<ResponsePropehtItem>>
            ) {
                val list = response.body()!!
                list.let { it.let { it1 -> adapter.adddatarasul(it1) } }
            }

            override fun onFailure(call: Call<List<ResponsePropehtItem>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
        return binding.root
    }


}
