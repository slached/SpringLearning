package com.example.restapi.service.impl

import com.example.restapi.dto.MovieDTO
import com.example.restapi.utils.mapper.MovieMapper
import com.example.restapi.repository.MovieRepository
import com.example.restapi.service.MovieService
import com.example.restapi.utils.exceptions.MovieException

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
        if (movieDTO.id != -1) throw MovieException("You have entered id in body. This is restricted!")
        else return movieMapper.fromEntity(movieRepository.save(movieMapper.toEntity(movieDTO)))

    }

    override fun getAllMovie(): List<MovieDTO> {
        val movies = movieRepository.getAllMovies()
        if (movies.isEmpty()) throw MovieException("There is no movie to be shown.")
        return movies.map {
            movieMapper.fromEntity(it)
        }
    }

    override fun getOneMovie(id: Int): MovieDTO {
        if (movieRepository.findById(id).isEmpty) throw MovieException("There is no movie founded by this id.")
        else return movieMapper.fromEntity(movieRepository.findById(id).get())
    }

    override fun deleteMovieById(id: Int): MovieDTO {
        val movie = movieRepository.findById(id)
        if (movie.isEmpty) throw MovieException("Film that you want to delete is not exists.")
        else {
            movieRepository.deleteById(id)
            return movieMapper.fromEntity(movie.get())
        }
    }

}