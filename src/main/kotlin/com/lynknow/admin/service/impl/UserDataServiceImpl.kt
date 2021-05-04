package com.lynknow.admin.service.impl

import com.lynknow.admin.model.UserData
import com.lynknow.admin.pojo.PaginationModel
import com.lynknow.admin.pojo.response.BaseResponse
import com.lynknow.admin.pojo.response.UserDataResponse
import com.lynknow.admin.repository.UserDataRepository
import com.lynknow.admin.service.UserDataService
import com.lynknow.admin.util.GenerateResponseUtil
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserDataServiceImpl: UserDataService {

    private val logger = LoggerFactory.getLogger(UserDataServiceImpl::class.java)

    @Autowired
    private val userDataRepo: UserDataRepository? = null

    @Autowired
    private val generateRes: GenerateResponseUtil? = null

    override fun getListSubscriber(model: PaginationModel): ResponseEntity<*> {
        try {
            var page: Page<UserDataResponse>? = if (model.sort.equals("asc")) {
                userDataRepo?.getListSubscriber(
                    pageable = PageRequest.of(model.page!!, model.size!!, Sort.by(model.sortBy).ascending())
                )?.map { data: UserData -> generateRes?.generateResponseUser(data) }
            } else {
                userDataRepo?.getListSubscriber(
                    pageable = PageRequest.of(model.page!!, model.size!!, Sort.by(model.sortBy).descending())
                )?.map { data: UserData -> generateRes?.generateResponseUser(data) }
            }

            return ResponseEntity<Any?>(
                BaseResponse(
                    status = true,
                    code = 200,
                    message = "Success",
                    data = page
                ), HttpStatus.OK)
        } catch (e: Exception) {
            e.printStackTrace()
            logger.error("Error processing data", e)
            return ResponseEntity<Any?>(
                BaseResponse(
                    status = true,
                    code = 500,
                    message = e.message!!
                ), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}