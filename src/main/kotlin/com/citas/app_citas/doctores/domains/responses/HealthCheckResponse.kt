package com.citas.app_citas.doctores.domains.responses

import org.springframework.http.HttpStatus

data class HealthCheckResponse (
    val status: String = HttpStatus.OK.name
)