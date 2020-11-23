package com.gzeinnumer.repositoryimplementationexamplekt.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class DummyRepositoryImpl : DummyRepository {
    override val stringRepository: LiveData<String>
        get() {
            val str = MutableLiveData<String>()
            str.value = "String From DummyRepositoryImpl"
            return str
        }
}