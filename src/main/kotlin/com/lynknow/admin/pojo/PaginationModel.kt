package com.lynknow.admin.pojo

data class PaginationModel(
    var page: Int? = 0,
    var size: Int? = 0,
    var sort: String? = "asc",
    var sortBy: String? = "id",
    var param: String? = ""
)
