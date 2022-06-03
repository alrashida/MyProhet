package com.mysus.sklceritanabi.Adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import com.mysus.sklceritanabi.DetailActivity
import com.mysus.sklceritanabi.Viewholder.RasulViewHolder
import com.mysus.sklceritanabi.databinding.ItemRecyclerRasulBinding
import com.mysus.sklceritanabi.model.ResponsePropehtItem

class AdapterRasul : RecyclerView.Adapter<RasulViewHolder>() {
    private var listRasul = arrayListOf<ResponsePropehtItem>()

    @SuppressLint("NotifyDatasetChanged")
    fun adddatarasul(items : List<ResponsePropehtItem>){
        listRasul.clear()
        listRasul.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RasulViewHolder {
        val listItemRasulBinding =
            ItemRecyclerRasulBinding.inflate(LayoutInflater.from(parent.context),parent,
                false)
        return RasulViewHolder(listItemRasulBinding)
    }

    override fun onBindViewHolder(holder: RasulViewHolder, position: Int) {
        val data = listRasul[position]

        holder.RasulBinding.txtNamarasul.text = data.nama
        holder.RasulBinding.imageView2.load(data.avatar!!)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,DetailActivity::class.java)
            intent.putExtra(DetailActivity.Data,data)

            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listRasul.size
    }

}