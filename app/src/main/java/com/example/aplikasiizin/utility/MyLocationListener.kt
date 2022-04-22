package com.example.aplikasiizin.utility

import android.location.Location

interface MyLocationListener {
    fun onLocationChanged(location: Location)
}