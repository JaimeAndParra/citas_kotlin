package com.citas.app_citas.doctores.controller

import com.citas.app_citas.doctores.constants.HEALTH_CHECK
import com.citas.app_citas.doctores.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController


@RestController
class HealthCheckController {

    // TEST
    @GetMapping(HEALTH_CHECK)
    fun healthCheck():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)

}