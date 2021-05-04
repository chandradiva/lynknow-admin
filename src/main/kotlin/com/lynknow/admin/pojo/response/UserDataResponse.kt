package com.lynknow.admin.pojo.response

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

class UserDataResponse {

    var id: Long? = null
    var username: String? = null
    var email: String? = null
    var firstName: String? = null
    var lastName: String? = null
    var verificationPoint = 0
    var currentSubscription: SubscriptionPackageResponse? = null
    var role: RoleDataResponse? = null
//    var profile: UserProfileResponse? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT+8")
    var joinDate: Date? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT+8")
    var createdDate: Date? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT+8")
    var updatedDate: Date? = null

    var maxVerificationCredit = 0
    var currentVerificationCredit = 0
    var profilePhoto: String? = null
    var maxTotalView = 500
    var usedTotalView = 0
    var expiredPremiumDate: Date? = null
    var expiredTotalView: Date? = null
    
}