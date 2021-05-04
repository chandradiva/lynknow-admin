package com.lynknow.admin.controller

import com.lynknow.admin.pojo.response.BaseResponse
import com.lynknow.admin.repository.RoleDataRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/test"])
class TestController {

    private val logger = LoggerFactory.getLogger(TestController::class.java)

    @Autowired
    private val roleDataRepo: RoleDataRepository? = null

    @GetMapping("check")
    fun testApi(): ResponseEntity<*>? {
        logger.error("ERROR LOG")
        logger.debug("DEBUG LOG")
        logger.info("INFO LOG")

        return ResponseEntity<Any?>(
            BaseResponse(
                status = true,
                code = 200,
                message = "Success"
            ), HttpStatus.OK
        )
    }

    @GetMapping("check-db")
    fun testDb(): ResponseEntity<*>? {
        return ResponseEntity<Any?>(
            BaseResponse(
                true,
                200,
                "Success",
                roleDataRepo!!.getList()
            ), HttpStatus.OK
        )
    }

}