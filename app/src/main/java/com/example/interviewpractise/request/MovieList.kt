package com.example.interviewpractise.request

import com.google.gson.annotations.SerializedName

data class MovieList(@SerializedName("Search") val mList : List<Movie>)
