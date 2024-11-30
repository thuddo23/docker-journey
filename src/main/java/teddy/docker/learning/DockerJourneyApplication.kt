package teddy.docker.learning

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

//@EnableJpaRepositories
@SpringBootApplication
class NoteTakingApplication {
    @Value("\${spring.datasource.url}")
    lateinit var datasourceUrl: String

    @Bean
    fun printDatasourceUrl() = ApplicationListener<ApplicationReadyEvent> {
        println("Datasource URL: $datasourceUrl")
    }
}

fun main(args: Array<String>) {
    runApplication<NoteTakingApplication>(*args)
}