package com.example.restapi.utils.exceptions

import org.springframework.http.HttpStatus

//this is api error data type
data class ApiError(
    var message: String?,
    var status: HttpStatus = HttpStatus.BAD_REQUEST,
    var code: Int = status.value()
)
