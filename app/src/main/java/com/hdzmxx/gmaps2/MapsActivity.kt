package com.hdzmxx.gmaps2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val rumah= LatLng(-7.746239,110.344933)
        val uty = LatLng(-7.747033, 110.355398)
        val pasar = LatLng(-7.7898921,110.3620675)
        mMap.addMarker(MarkerOptions().position(uty).title("Universitas Teknologi Yogyakarta"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uty, 17.0f))
        mMap.addMarker(MarkerOptions().position(rumah).title("Rumahku"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rumah, 17.0f))
        mMap.addMarker(MarkerOptions().position(pasar).title("Pasar kembang"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pasar, 17.0f))
    }

}