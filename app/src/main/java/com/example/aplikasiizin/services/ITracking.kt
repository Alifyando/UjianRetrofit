package com.example.aplikasiizin.services

import com.example.aplikasiizin.model.ResponsePostData
import com.example.aplikasiizin.model.ResponseTracking
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface ITracking {
    @FormUrlEncoded
    @Headers("X-Api-Key:EF4953FB214259C7BFD8786C08DE8F3D")
    @POST("api/tracking/add")
    fun addDataTracking(@Field("id_user") id_user:String, @Field("latitude") latitude:String,
                        @Field("longitude") longitude:String, @Field("time") time:String): retrofit2.Call<ResponseTracking>

}