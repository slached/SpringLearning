package com.example.restapi.utils.mapper

import com.example.restapi.dto.MovieDTO
import com.example.restapi.entity.Movie
import org.springframework.stereotype.Service

@Service
class MovieMapper : Mapper<MovieDTO, Movie> {
    override fun toEntity(domain: MovieDTO): Movie {
        return Movie(
            domain.id,
            domain.name,
            domain.rating
        )
    }

    override fun fromEntity(entity: Movie): MovieDTO {
        return MovieDTO(
            entity.id,
            entity.name,
            entity.rating
        )
    }

}