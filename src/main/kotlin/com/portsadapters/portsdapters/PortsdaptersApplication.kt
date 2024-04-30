package com.portsadapters.portsdapters

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PortsAdaptersApplication

fun main(args: Array<String>) {
	runApplication<PortsAdaptersApplication>(*args)
}
