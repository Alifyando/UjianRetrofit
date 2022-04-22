package com.example.aplikasiizin.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponsePostDataAbsen(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
) : Parcelable

@Parcelize
data class AbsenItem(

	@field:SerializedName("foto")
	val foto: String? = null,

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("masuk")
	val masuk: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("keluar")
	val keluar: String? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("absen")
	val absen: List<AbsenItem?>? = null
) : Parcelable
