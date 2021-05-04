package com.lynknow.admin.model

import javax.persistence.*

@Entity
@Table(name = "role_data", schema = "public")
class RoleData {

    @Id
    @Column(name = "id", unique = true)
    @SequenceGenerator(name = "pk_sequence", sequenceName = "role_data_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    var id: Int? = null

    @Column(name = "name")
    var name: String? = null

    @Column(name = "description")
    var description: String? = null

}