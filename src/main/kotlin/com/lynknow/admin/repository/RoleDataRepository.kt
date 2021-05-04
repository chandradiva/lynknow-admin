package com.lynknow.admin.repository

import com.lynknow.admin.model.RoleData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface RoleDataRepository: JpaRepository<RoleData, Integer> {

    @Query("FROM RoleData ORDER BY id ASC")
    fun getList(): List<RoleData>?

}