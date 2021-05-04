package com.lynknow.admin.pojo.response

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

class SubscriptionPackageResponse {

    var id: Int? = null
    var name: String? = null
    var description: String? = null
    var price: Int? = null
    var currency: String? = null
    var period: String? = null
    var interval: Int? = null
    var imageUrl: String? = null
    var details: List<String>? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT+8")
    var createdDate: Date? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT+8")
    var updatedDate: Date? = null
    
}