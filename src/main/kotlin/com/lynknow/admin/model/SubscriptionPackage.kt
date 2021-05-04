package com.lynknow.admin.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "subscription_package", schema = "public")
class SubscriptionPackage {

    @Id
    @Column(name = "id", unique = true)
    @SequenceGenerator(name = "pk_sequence", sequenceName = "subscription_package_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    var id: Int? = null

    @Column(name = "name")
    var name: String? = null

    @Column(name = "description")
    var description: String? = null

    @Column(name = "price")
    var price: Int? = null

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    var createdDate: Date? = null

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    var updatedDate: Date? = null

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted_date")
    var deletedDate: Date? = null

    @Column(name = "is_active")
    var isActive = 0

    @Column(name = "currency")
    var currency: String? = null

    @Column(name = "period")
    var period: String? = null

    @Column(name = "interval")
    var interval: Int? = null

    @Column(name = "image_url")
    var imageUrl: String? = null

    @Column(name = "is_show")
    var isShow = 1
    
}