package com.abbisea

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.abbisea.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSockets()
        configureSerialization()
        configureTemplating()
        configureMonitoring()
    }.start(wait = true)
}
