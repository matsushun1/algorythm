package com.example.demo

import com.example.demo.sort.fSort.FSort
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
    FSort().executeFSort()
}
