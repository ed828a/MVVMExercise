package com.example.ed828.mvvmexercise.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ed828.mvvmexercise.model.Quote

class FakeQuoteDao {

    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote){
        quoteList.add(quote)
        quotes.value = quoteList // updating LiveData Quotes which will trigger Observers
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>
}