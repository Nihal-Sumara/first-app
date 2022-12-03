package com.example.interviewpractise.repository

import com.example.interviewpractise.network.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllMovies() = retrofitService.getAllMovies()
}