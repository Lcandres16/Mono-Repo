package com.example.grades

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class GradesApplication

fun main(args: Array<String>) {
	runApplication<GradesApplication>(*args)
}
