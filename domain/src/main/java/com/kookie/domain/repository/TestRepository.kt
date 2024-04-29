package com.kookie.domain.repository

import com.kookie.domain.model.TestModel

interface TestRepository {
    fun getTestData() : TestModel

}