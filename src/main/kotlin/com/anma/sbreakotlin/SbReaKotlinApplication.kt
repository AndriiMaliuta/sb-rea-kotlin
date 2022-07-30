package com.anma.sbreakotlin

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class SbReaKotlinApplication()

fun main(args: Array<String>) {
    runApplication<SbReaKotlinApplication>(*args)
}


@Component
class Boot(val commentRepo: CommentRepo) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Loading data...")
        loadData()
    }

    fun loadData(): Unit {
        val comments = commentRepo.findAll()
        comments.doOnEach {
            println(it)
        }.doOnNext {
            println("next")
        }.publish()
    }
}