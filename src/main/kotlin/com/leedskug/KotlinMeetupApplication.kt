package com.leedskug

import org.apache.logging.log4j.LogManager

class KotlinMeetupApplication {

    companion object {
        private val log = LogManager.getLogger(KotlinMeetupApplication::class.java)
    }

    init {
        log.info("Starting Leeds Kotlin Meetup Application")
    }

    fun run() {
        log.info("Running method")
    }
}

fun main(args: Array<String>) {

    KotlinMeetupApplication().run()
}
