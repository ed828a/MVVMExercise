package com.example.ed828.mvvmexercise.utillities

import com.example.ed828.mvvmexercise.data.FakeDatabase
import com.example.ed828.mvvmexercise.data.QuoteRepository
import com.example.ed828.mvvmexercise.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteDao = FakeDatabase.getInstance().quoteDao
        val quoteRepository = QuoteRepository.getInstance(quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}