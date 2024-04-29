package com.kookie.data.datasource

import com.kookie.data.model.TestModelResponse

class TestDataSource {
    fun getTestModelResponse() : TestModelResponse {
        return TestModelResponse("response")
    }
}