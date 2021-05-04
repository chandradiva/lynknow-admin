package com.lynknow.admin.repository

import com.lynknow.admin.model.UserData
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserDataRepository: JpaRepository<UserData, Long> {

    @Query("SELECT ud FROM UserData ud " +
            "WHERE ud.isActive = 1 " +
            "AND ud.roleData.id = 2")
    fun getListSubscriber(pageable: Pageable): Page<UserData>?

}