package com.mysus.sklceritanabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.mysus.sklceritanabi.databinding.ActivityDetailBinding
import com.mysus.sklceritanabi.model.ResponsePropehtItem

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding

    companion object{
        const val Data = "P"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<ResponsePropehtItem>(Data)

    binding.tvNamaNabi.text = data?.nama
    binding.tvTpTinggal.text = data?.tempat
    binding.tvTpKelahiran.text = data?.tpKelahiran
    binding.tvUsia.text = data?.usia
    binding.tvDesk.text = data?.deskripsi
    binding.imgNabi.load(data?.avatar)
    }


}