package org.rain.gifts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.osmdroid.config.Configuration
import org.osmdroid.events.MapListener
import org.osmdroid.events.ScrollEvent
import org.osmdroid.events.ZoomEvent
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.rain.gifts.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity(), MapListener {

    private lateinit var binding: ActivityMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Configuration.getInstance().userAgentValue = BuildConfig.APPLICATION_ID
        binding.mapView.setBuiltInZoomControls(true)
        binding.mapView.setTileSource(TileSourceFactory.MAPNIK)

    }

    override fun onScroll(event: ScrollEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onZoom(event: ZoomEvent?): Boolean {
        TODO("Not yet implemented")
    }


}