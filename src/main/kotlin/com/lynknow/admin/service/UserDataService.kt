package com.lynknow.admin.service

import com.lynknow.admin.pojo.PaginationModel
import org.springframework.http.ResponseEntity

interface UserDataService {

    fun getListSubscriber(model: PaginationModel): ResponseEntity<*>

}