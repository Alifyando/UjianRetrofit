package com.example.aplikasiizin.utility

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle

class LocationHelper {

    var LOCATION_REFRESH_TIME =30000 // 30 detik update gps
    var LOCATION_REFRESH_DISTANCE = 0 // jarak minimum GPS direfresh

    @SuppressLint("MissingPermission")
    fun startListeningUserLocation(context: Context, myListener : MyLocationListener){
        val mLocationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

        val locationListener:LocationListener = object:LocationListener{
            override fun onLocationChanged(location: Location) {
                myListener.onLocationChanged(location)
            }

            override fun onProviderEnabled(provider: String) {

            }

            override fun onProviderDisabled(provider: String) {

            }

            override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {

            }
        }

        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,LOCATION_REFRESH_TIME.toLong(),LOCATION_REFRESH_DISTANCE.toFloat(),locationListener)

    }
}