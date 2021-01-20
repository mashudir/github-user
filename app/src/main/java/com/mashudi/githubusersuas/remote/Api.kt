package com.mashudi.githubusersuas.remote

import com.mashudi.githubusersuas.data.model.User
import com.mashudi.githubusersuas.data.model.UserResponse
import com.mashudi.githubusersuas.data.model.DetailUserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 5cd1611554c9dab3be11ec6e98a751082ef9899a")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 5cd1611554c9dab3be11ec6e98a751082ef9899a")
    fun detDetailUser(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 5cd1611554c9dab3be11ec6e98a751082ef9899a")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 5cd1611554c9dab3be11ec6e98a751082ef9899a")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}