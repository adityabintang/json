package com.example.json


data class ConverterJson (
        val htmlattribution : List<Any>,
        val results : List<result>,
        var statuse : String
)

data class Any (
        var html_attributions : String,
        )
data class result (
        val addressComponent : List<address_component>,
        var formatted_address : String,
        var formatted_phone_number : String,
        val geometrys : List<geometry>,
        var icon : String,
        var id : String,
        var internation_phone_number : String,
        var name : String,
        var reference: String,
        var types: String,
        var url : String,
        var vicinity : String,
        var website : String
        )
data class address_component(
        var long_name : String,
        var short_name : String,
        val type : List<types>
)
data class types (
        var types : String
        )
data class geometry (
        val locations : List<location>
        )
data class location (
        var lat : Double,
        var lng : Double
        )
