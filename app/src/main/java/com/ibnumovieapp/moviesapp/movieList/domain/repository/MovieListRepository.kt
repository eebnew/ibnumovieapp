package com.ibnumovieapp.moviesapp.movieList.domain.repository

import com.ibnumovieapp.moviesapp.movieList.domain.model.Movie
import com.ibnumovieapp.moviesapp.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

 
interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}