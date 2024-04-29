package com.kookie.data.repository

import com.kookie.data.datasource.TestDataSource
import com.kookie.data.model.toDomainModel
import com.kookie.domain.model.TestModel
import com.kookie.domain.repository.TestRepository

class TestReopsitoryImpl(val dataSource: TestDataSource) : TestRepository {
    override fun getTestData(): TestModel {
        return dataSource.getTestModelResponse().toDomainModel()
    }

}