package com.himanshu.androidbasics.network

import com.himanshu.androidbasics.AppState
import retrofit2.Response
import javax.inject.Inject


class QuoteRepository @Inject constructor(
    private val quoteService: QuoteService
) {

    suspend fun getQuoteOfTheDay(): AppState.SampleQuote {
        return quoteService.getQuoteOfTheDay().first()
    }

    suspend fun getAllTheQuotes(): List<AppState.SampleQuote> {
        return quoteService.getAllTheQuotes()
    }


}