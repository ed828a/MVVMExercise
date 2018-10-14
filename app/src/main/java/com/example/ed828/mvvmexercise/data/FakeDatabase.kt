package com.example.ed828.mvvmexercise.data

class FakeDatabase private constructor(){

    var quoteDao = FakeQuoteDao()
        private set  // means that it can be set in this class only.

    // to create a singleton in Java way
    companion object {
        @Volatile  //meaning that writes to this field are immediately made visible to other threads.
        private var instance: FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this){
            instance ?: FakeDatabase().also { instance = it }
        }

    }
}