package com.abbisea.plugins

import com.abbisea.routes.adventByDay
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Abbi's server")
        }
        adventByDay()
    }
}
