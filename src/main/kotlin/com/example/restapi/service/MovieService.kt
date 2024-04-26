package com.example.restapi.service

import com.example.restapi.dto.MovieDTO

interface MovieService {
    fun createMovie(movieDTO: MovieDTO): MovieDTO
    fun getAllMovie(): List<MovieDTO>
    fun getOneMovie(id: Int): MovieDTO
    fun deleteMovieById(id: Int): MovieDTO
}