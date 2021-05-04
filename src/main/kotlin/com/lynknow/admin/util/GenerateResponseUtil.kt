package com.lynknow.admin.util

import com.lynknow.admin.model.RoleData
import com.lynknow.admin.model.SubscriptionPackage
import com.lynknow.admin.model.UserData
import com.lynknow.admin.pojo.response.RoleDataResponse
import com.lynknow.admin.pojo.response.SubscriptionPackageResponse
import com.lynknow.admin.pojo.response.UserDataResponse
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Component

@Component
class GenerateResponseUtil {

    fun generateResponseRole(role: RoleData?): RoleDataResponse? {
        val res = RoleDataResponse()
        if (role == null) {
            return null
        }

        BeanUtils.copyProperties(role, res)

        return res
    }

    fun generateResponseSubscription(param: SubscriptionPackage?): SubscriptionPackageResponse? {
        val res = SubscriptionPackageResponse()
        if (param == null) {
            return null
        }

        BeanUtils.copyProperties(param, res)

        return res
    }

    fun generateResponseUser(param: UserData?): UserDataResponse? {
        val res = UserDataResponse()
        param?.let {
            BeanUtils.copyProperties(it, res)

            res.role = generateResponseRole(it.roleData)
            res.currentSubscription = generateResponseSubscription(it.currentSubscriptionPackage)

            it.currentSubscriptionPackage?.let { subs ->
                if (subs.id == 2 || subs.id == 3) {
                    // premium
                    res.maxVerificationCredit = it.maxVerificationCredit
                    res.currentVerificationCredit = it.currentVerificationCredit
                    res.expiredPremiumDate = it.expiredPremiumDate
                } else {
                    res.maxVerificationCredit = 0
                    res.currentVerificationCredit = 0
                    res.expiredPremiumDate = null
                }

            }

            return res
        } ?: return null
    }

}