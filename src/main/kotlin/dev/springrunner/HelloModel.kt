package dev.springrunner

import org.springframework.format.annotation.DateTimeFormat
import org.springframework.util.StringUtils
import java.util.Date

class HelloModel(name: String?) {

    var name: String? = null

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val currentDateTime: Date

    init {
        if (StringUtils.hasText(name)) {
            this.name = name
        } else {
            this.name = "스프링 웹 애플리케이션"
        }
        this.currentDateTime = Date()
    }
}