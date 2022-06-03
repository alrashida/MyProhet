package com.mysus.sklceritanabi.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponsePropeht(

	@field:SerializedName("ResponsePropeht")
	val responsePropeht: List<ResponsePropehtItem?>? = null
):Parcelable

@Parcelize
data class ResponsePropehtItem(

	@field:SerializedName("usia")
	val usia: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("tempat")
	val tempat: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("avatar")
	val avatar: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tp_kelahiran")
	val tpKelahiran: String? = null
):Parcelable
