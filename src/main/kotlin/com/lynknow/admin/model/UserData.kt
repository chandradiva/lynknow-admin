package com.lynknow.admin.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "user_data", schema = "public")
class UserData {

    @Id
    @Column(name = "id", unique = true)
    @SequenceGenerator(name = "pk_sequence", sequenceName = "user_data_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    var id: Long? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "password")
    var password: String? = null

    @Column(name = "first_name")
    var firstName: String? = null

    @Column(name = "last_name")
    var lastName: String? = null

    @Column(name = "verification_point")
    var verificationPoint = 0

    @ManyToOne
    @JoinColumn(name = "current_subscription_package_id")
    var currentSubscriptionPackage: SubscriptionPackage? = null

    @ManyToOne
    @JoinColumn(name = "role_data_id")
    var roleData: RoleData? = null

    @Column(name = "join_date")
    var joinDate: Date? = null

    @Column(name = "created_date")
    var createdDate: Date? = null

    @Column(name = "updated_date")
    var updatedDate: Date? = null

    @Column(name = "deleted_date")
    var deletedDate: Date? = null

    @Column(name = "is_active")
    var isActive = 1

    @Column(name = "max_verification_credit")
    var maxVerificationCredit = 0

    @Column(name = "current_verification_credit")
    var currentVerificationCredit = 0

    @Column(name = "fb_id")
    var fbId: String? = null

    @Column(name = "fb_email")
    var fbEmail: String? = null

    @Column(name = "google_id")
    var googleId: String? = null

    @Column(name = "google_email")
    var googleEmail: String? = null

    @Column(name = "access_token")
    var accessToken: String? = null

    @Column(name = "expired_token")
    var expiredToken: Date? = null

    @Column(name = "max_total_view")
    var maxTotalView = 500

    @Column(name = "used_total_view")
    var usedTotalView = 0

    @Column(name = "temp_email")
    var tempEmail: String? = null

    @Column(name = "expired_premium_date")
    var expiredPremiumDate: Date? = null

    @Column(name = "expired_total_view")
    var expiredTotalView: Date? = null
    
}