package com.example.restapi.web.rest

import com.example.restapi.dto.MovieDTO
import com.example.restapi.entity.Movie
import com.example.restapi.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @PostMapping("/createMovie")
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
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