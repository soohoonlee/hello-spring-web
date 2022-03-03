package dev.springrunner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSpringWebApplication

fun main(args: Array<String>) {
    runApplication<HelloSpringWebApplication>(*args)
}
