package com.example.restapi.utils.exceptions

//this is overriding exception class
class MovieException(override val message: String?) : Exception(message)