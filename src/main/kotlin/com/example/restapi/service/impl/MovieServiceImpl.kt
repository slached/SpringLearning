package com.example.restapi.service.impl

import com.example.restapi.dto.MovieDTO
import com.example.restapi.entity.Movie
import com.example.restapi.utils.mapper.MovieMapper
import com.example.restapi.repository.MovieRepository
import com.example.restapi.service.MovieService

import com.sun.nio.sctp.IllegalReceiveException
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {

    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        // this will return dto but after save new movie
        // and also repo of the movie require movie entity as type: so we need to use map to convert dto into entity
        // and our function's return type is dto: so we need to reconvert entity to dto
        // if there is id in body throw exception else create new movie
        if (movieDTO.id != -1) throw IllegalReceiveException("You have entered id in body. This is restricted!")
        else return movieMapper.fromEntity(movieRepository.save(movieMapper.toEntity(movieDTO)))

    }

    override fun getAllMovie(): MutableIterable<Movie> {
        return movieRepository.findAll()
    }

    override fun deleteMovieById(id: Int) {
        return movieRepository.deleteById(id)
    }

}