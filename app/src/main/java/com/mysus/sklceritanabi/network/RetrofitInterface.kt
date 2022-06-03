package com.mysus.sklceritanabi.network

import com.mysus.sklceritanabi.model.ResponsePropehtItem
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
   @GET("v1/nabi")
   fun getDataNabi() : Call<List<ResponsePropehtItem>>

   @GET("v1/Rasul")
   fun getDatarasul() : Call<List<ResponsePropehtItem>>

}