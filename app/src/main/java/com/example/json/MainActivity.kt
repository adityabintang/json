package com.example.json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //                    TODO 3
//                    val json = JSONObject("")
//                    val htmlAttribute = json.getString("html_attributions")
//                    val result = json.getJSONObject("result")
//                    val addressComponent = json.getJSONArray("Address_component")
//                    for (i in 0..addressComponent.length()) {
//                        val obj = addressComponent.getJSONObject(i)
//                        val longName = obj.getString("long_name")
//                        val shotName = obj.getString("short_name")
//                        val type = obj.getString("Types")
//                    }
//
//                    val formatAddress = result.getString("Formatted Address")
//                    val formatPhoneNumber = result.getString("Formatted Phone Number")
//                    val geometry = result.getJSONObject("Geometry")
//                    val location = geometry.getJSONObject("location")
//                    val lat = location.getLong("lat")
//                    val lng = location.getLong("lng")
//
//                    val icon = result.getString("icon")
//                    val id = result.getString("id")
//                    val interPhoneNumber = result.getString("international phone number")
//                    val name = result.getString("name")
//                    val reference = result.getString("Reference")
//                    val type = result.getString("type")
//                    val url = result.getString("URl")
//                    val vicinity = result.getString("vicinity")
//                    val website = result.getString("Website")
//
//                    val status = result.getString("status")
    }
}