package com.realsimplecoding

import com.realsimplecoding.dao.DatabaseFactory
import com.realsimplecoding.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    DatabaseFactory.init(environment.config)
    configureRouting()
}
