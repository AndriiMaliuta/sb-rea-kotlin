package com.anma.sbreakotlin

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("comments")
class Comment {
    var body: String = ""
    var author: String = ""
    var createdDate: LocalDateTime = LocalDateTime.now()
}

data class Person(var id: Long, var name: String, var age: Int)


@Table(value = "cars")
public class Car {

    @Id
    @Column(value = "car_id")
    var carId: Long = 0
    var id: String = ""
    var model: String = ""
    var color: String = ""
    var registry: String = ""
    var origin: String = ""
    var brand: String = ""
    @Column(value = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now()
    @Column(value = "country_codes")
    var countryCodes: String = ""
    @Column(value = "max_speed")
    var maxSpeed: Int = 0
    var age: Int = 0
    @Column(value = "person_id")
    var personId: Long = 0

}