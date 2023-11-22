package br.com.microservices.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@Component
@RefreshScope
@ConfigurationProperties("microservices")
class GreetingConfiguration {
    var greeting: String? = null
    var defaultValue: String? = null
}