package com.abbisea.plugins

import com.abbisea.routes.adventByDay
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Abbi's server")
        }
        adventByDay()
    }
}
