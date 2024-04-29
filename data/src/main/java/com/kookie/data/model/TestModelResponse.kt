package com.kookie.data.model

import com.kookie.domain.model.TestModel

class TestModelResponse(val name: String?)
fun TestModelResponse.toDomainModel() : TestModel? {
    if (name != null){
        return TestModel(name)
    }
    return null
}

