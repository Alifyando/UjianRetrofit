package com.example.aplikasiizin.services

import android.telecom.Call
import com.example.aplikasiizin.model.GetIzinResponse
import com.example.aplikasiizin.model.ResponsePostData
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface IIjin {

    @Headers("X-Api-Key:DBCC14EAEF386747A9291D60998D88D8")
    @GET("api/ijin/all")
    fun getAllIjin(): retrofit2.Call<GetIzinResponse>

    @FormUrlEncoded
    @Headers("X-Api-Key:DBCC14EAEF386747A9291D60998D88D8")
    @POST("api/ijin/add")
    fun addDataForm(@Field("kategori") kategori:String, @Field("dari") dari:String,
                    @Field("sampai") sampai:String, @Field("perihal") perihal:String, @Field("keterangan") keterangan:String): retrofit2.Call<ResponsePostData>


    @Multipart
    @Headers("X-Api-Key:DBCC14EAEF386747A9291D60998D88D8")
    @POST("api/ijin/add")
    fun addDataAndImage(@Part("kategori") kategori:RequestBody,@Part("dari") dari:RequestBody,
                        @Part("sampai") sampai:RequestBody,@Part("perihal") perihal:RequestBody,
                        @Part("keterangan") keterangan:RequestBody,
                        @Part file: MultipartBody.Part): retrofit2.Call<ResponsePostData>


}