package com.gzeinnumer.repositoryimplementationexamplekt.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainVM : ViewModel() {
    var repository: DummyRepositoryImpl = DummyRepositoryImpl()

    val data: LiveData<String>
        get() = repository.stringRepository

}