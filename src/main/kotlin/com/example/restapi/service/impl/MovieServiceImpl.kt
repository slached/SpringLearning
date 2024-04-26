package com.example.restapi.service.impl

import com.example.restapi.dto.MovieDTO
import com.example.restapi.entity.Movie
import com.example.restapi.utils.mapper.MovieMapper
import com.example.restapi.repository.MovieRepository
import com.example.restapi.service.MovieService
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        val newMovie = movieMapper.toEntity(movieDTO)
        movieRepository.save(newMovie)
        return movieMapper.fromEntity(newMovie)
    }

    override fun getAllMovie(): MutableIterable<Movie> {
        return movieRepository.findAll()
    }

    override fun deleteMovieById(id: Int) {
        return movieRepository.deleteById(id)
    }


}