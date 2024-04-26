package com.example.restapi.web.rest

import com.example.restapi.dto.MovieDTO
import com.example.restapi.entity.Movie
import com.example.restapi.service.MovieService
import com.sun.nio.sctp.IllegalReceiveException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieResource(
    //service injection
    private val movieService: MovieService
) {

    @PostMapping("/createMovie")
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<Any> {
        return try {
            ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
        } catch (exception: IllegalReceiveException) {
            ResponseEntity(exception.message, HttpStatus.BAD_REQUEST)
        }
    }

    @GetMapping("/getAllMovies")
    fun getAllMovie(): MutableIterable<Movie> {
        return movieService.getAllMovie()
    }

    @DeleteMapping("/deleteOneMovie", "id")
    fun deleteMovieById(id: Int) {
        return movieService.deleteMovieById(id)
    }
}