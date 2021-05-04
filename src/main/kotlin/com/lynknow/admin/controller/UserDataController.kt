package com.lynknow.admin.controller

import com.lynknow.admin.pojo.PaginationModel
import com.lynknow.admin.service.UserDataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/users"])
class UserDataController {

    @Autowired
    private val userDataService: UserDataService? = null

    @GetMapping("")
    fun getListSubscriber(myPage: PaginationModel): ResponseEntity<*>? {
        return userDataService?.getListSubscriber(myPage)
    }

}