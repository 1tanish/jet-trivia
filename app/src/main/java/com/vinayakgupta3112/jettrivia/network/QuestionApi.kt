package com.vinayakgupta3112.jettrivia.network

import com.vinayakgupta3112.jettrivia.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question

}