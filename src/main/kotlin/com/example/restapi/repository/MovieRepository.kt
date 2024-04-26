package com.example.restapi.repository

import com.example.restapi.entity.Movie
import org.springframework.data.repository.CrudRepository

interface MovieRepository : CrudRepository<Movie, Int> {
}