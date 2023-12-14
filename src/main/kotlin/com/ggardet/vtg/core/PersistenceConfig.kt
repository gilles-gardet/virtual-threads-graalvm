package com.ggardet.vtg.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.auditing.DateTimeProvider
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import java.time.Instant
import java.util.Optional

@EnableJpaAuditing
@EnableJpaRepositories(basePackages = ["com.ggardet.vtg"])
@Configuration
class PersistenceConfig {
    @Bean
    fun dateTimeProvider(): DateTimeProvider = DateTimeProvider { Optional.of(Instant.now()) }
}

