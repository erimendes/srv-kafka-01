package br.com.example.kafkaexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaexampleApplication

fun main(args: Array<String>) {
	runApplication<KafkaexampleApplication>(*args)
}
