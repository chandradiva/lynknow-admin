package com.lynknow.admin.pojo.response

data class BaseResponse(
    var status: Boolean? = true,
    var code: Int = 200,
    var message: String = "Success",
    var data: Any? = null
)
