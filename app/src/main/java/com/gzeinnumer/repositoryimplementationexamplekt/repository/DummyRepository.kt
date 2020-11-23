package com.gzeinnumer.repositoryimplementationexamplekt.repository

import androidx.lifecycle.LiveData

interface DummyRepository {
    val stringRepository: LiveData<String>
}