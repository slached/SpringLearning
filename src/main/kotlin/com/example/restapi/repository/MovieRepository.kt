package com.example.restapi.repository

import com.example.restapi.entity.Movie

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : JpaRepository<Movie, Int> {

    @Query(value = "SELECT m FROM Movie as m")
    fun getAllMovies(): List<Movie>

}