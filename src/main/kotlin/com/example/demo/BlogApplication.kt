package com.example.demo

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//https://spring.io/guides/tutorials/spring-boot-kotlin/

// more about spring kotlin support

@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args) {
		setBannerMode(Banner.Mode.CONSOLE)
	}
}
