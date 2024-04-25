package com.example.databaseconnection

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

@SpringBootApplication
class DatabaseConnectionApplication(val dataSource: DataSource) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val log = LoggerFactory.getLogger(this::class.java)
        val restTemplate: JdbcTemplate = JdbcTemplate(dataSource)
        restTemplate.execute("select 1")
    }
}

fun main(args: Array<String>) {
    runApplication<DatabaseConnectionApplication>(*args)
}
