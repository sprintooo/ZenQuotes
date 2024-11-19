package com.himanshu.androidbasics.network

import com.himanshu.androidbasics.AppState
import retrofit2.Response
import retrofit2.http.GET

interface QuoteService {

    @GET("today")
    suspend fun getQuoteOfTheDay(): List<AppState.SampleQuote>

    @GET("quotes")
    suspend fun getAllTheQuotes():List<AppState.SampleQuote>
}