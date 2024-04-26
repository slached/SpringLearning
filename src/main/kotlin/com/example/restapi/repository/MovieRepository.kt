package com.example.restapi.repository

import com.example.restapi.entity.Movie
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MovieRepository : CrudRepository<Movie, Int> {

    @Query("select m from Movie as m")
    fun getAllMovies(): List<Movie>
}