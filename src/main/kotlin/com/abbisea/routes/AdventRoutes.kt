package com.abbisea.routes

import com.abbisea.advent.adventResource
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.adventByDay() {
    get("/advent/{day}") {
        val day = call.parameters["day"]
        val adventSolution = adventResource[day]
            ?: return@get call.respondText(
                "No advent day $day implemented!",
                status = HttpStatusCode.NotFound
            )
        call.respondText(adventSolution.solve())
    }
}