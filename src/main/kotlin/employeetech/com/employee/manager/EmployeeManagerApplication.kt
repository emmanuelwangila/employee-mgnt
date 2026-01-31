package employeetech.com.employee.manager

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter
import java.util.Arrays

@SpringBootApplication
class EmployeeManagerApplication

fun main(args: Array<String>) {
    SpringApplication.run(EmployeeManagerApplication::class.java, *args)
}

@Bean
fun corsFilter(): CorsFilter {
    val corsConfiguration = CorsConfiguration()
    corsConfiguration.allowCredentials = true
    corsConfiguration.allowedOrigins = listOf("http://localhost:4200")
    corsConfiguration.allowedHeaders = listOf(
        "Origin",
        "Content-Type",
        "Accept",
        "Authorization",
        "X-Requested-With",
        "Access-Control-Request-Method",
        "Access-Control-Request-Headers"
    )
    corsConfiguration.exposedHeaders = listOf(
        "Origin",
        "Content-Type",
        "Accept",
        "Authorization"
    )
    corsConfiguration.allowedMethods = listOf("GET", "POST", "PUT", "DELETE", "OPTIONS")

    val source = UrlBasedCorsConfigurationSource()
    source.registerCorsConfiguration("/**", corsConfiguration)

    return CorsFilter(source)
}
