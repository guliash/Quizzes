package com.guliash.quizzes.core.api

import com.guliash.quizzes.core.app.models.Place
import io.reactivex.Observable
import retrofit2.http.GET

interface Api {
    @GET("places")
    fun places(): Observable<List<Place>>
}