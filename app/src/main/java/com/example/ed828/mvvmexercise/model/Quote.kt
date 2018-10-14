package com.example.ed828.mvvmexercise.model

data class Quote(val quoteText: String,
            val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}