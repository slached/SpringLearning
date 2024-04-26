package com.example.restapi.utils.mapper

interface Mapper<D, E> {

    fun toEntity(domain: D): E
    fun fromEntity(entity: E): D

}