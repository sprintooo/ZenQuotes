package com.himanshu.androidbasics

import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.himanshu.androidbasics.network.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val quoteRepository: QuoteRepository
) : ViewModel() {

    private val _appState = MutableStateFlow(AppState.initial())
    val appState = _appState.asStateFlow()

    fun selectPage(page: AppState.Page) {
        _appState.update {
            return@update it.copy(
                navigation = it.navigation.copy(
                    selected = page
                )
            )
        }
        viewModelScope.launch {

        }
    }

    suspend fun fetchData() {

        viewModelScope.launch {
            val quoteOfTheDay = quoteRepository.getQuoteOfTheDay()
            val allQuotes = quoteRepository.getAllTheQuotes()
            Log.d("QUOTE", quoteOfTheDay.toString())
            _appState.update {
                return@update it.copy(
                    quoteOfTheDay = quoteOfTheDay,
                    allQuotes = allQuotes
                )
            }
        }
    }
}

data class AppState(
    val navigation: Navigation,
    val quoteOfTheDay: SampleQuote,
    val allQuotes: List<SampleQuote>
) {
    companion object {
        fun initial(): AppState {
            val pages = buildList {
                add(Page("All Quotes", Color.Blue))
                add(Page("Daily Quote", Color.Green))
                add(Page("Favorites", Color.Red))
            }
            return AppState(
                navigation = Navigation(
                    navItems = pages,
                    selected = pages[1]
                ),
                quoteOfTheDay = SampleQuote(
                    quote = "The best way to predict the future is to create it.",
                    author = "Peter Drucker"
                ),
                allQuotes = listOf(
                    SampleQuote(
                        quote = "The best way to predict the future is to create it.",
                        author = "Peter Drucker"
                    ),
                    SampleQuote(
                        quote = "The power to make and break habits and learning how to do that is really important.",
                        author = "Naval Ravikant"
                    )
                )
            )
        }
    }

    @Serializable
    data class SampleQuote(
        @SerialName("q") val quote: String,
        @SerialName("a") val author: String
    )

    data class Page(val title: String, val color: Color)

    data class Navigation(
        val navItems: List<Page>,
        val selected: Page
    )
}