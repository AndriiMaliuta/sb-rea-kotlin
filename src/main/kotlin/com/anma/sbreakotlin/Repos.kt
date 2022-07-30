package com.anma.sbreakotlin

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono

interface CommentRepo : ReactiveCrudRepository<Comment, Long> {
    fun findAllByAuthor(author: String): Mono<List<Comment>>
}