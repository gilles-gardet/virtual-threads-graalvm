package com.ggardet.vtg.resources.post.exception

import org.springframework.http.HttpStatus
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.Instant


@RestControllerAdvice
class RestErrorAdvisor : ResponseEntityExceptionHandler() {
    @ExceptionHandler(Exception::class)
    fun handleBookmarkNotFoundException(exception: Exception) =
        ErrorResponse.builder(exception, HttpStatus.INTERNAL_SERVER_ERROR, exception.message ?: "Unknown error")
            .title("Shit happens")
            .property("errorCategory", "Generic")
            .property("timestamp", Instant.now())
            .build()
}
