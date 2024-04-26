package com.example.restapi.service

import com.example.restapi.dto.MovieDTO
import com.example.restapi.entity.Movie

interface MovieService {
    fun createMovie(movieDTO: MovieDTO): MovieDTO
    fun getAllMovie(): MutableIterable<Movie>
    fun deleteMovieById(id: Int)
}