package com.mysus.sklceritanabi.Viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mysus.sklceritanabi.databinding.ItemRecyclerNabiBinding
import com.mysus.sklceritanabi.databinding.ItemRecyclerRasulBinding
import com.mysus.sklceritanabi.model.ResponsePropehtItem

class RasulViewHolder(val RasulBinding: ItemRecyclerRasulBinding) :
    RecyclerView.ViewHolder(RasulBinding.root) {
        fun bindview(item: ResponsePropehtItem){
            itemView.run {
                RasulBinding.txtNamarasul.text = item.nama
                Glide.with(this).load(item.avatar).into(RasulBinding.imageView2)
            }

        }

}
