package com.example.ed828.mvvmexercise.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.ed828.mvvmexercise.data.QuoteRepository
import com.example.ed828.mvvmexercise.model.Quote

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}