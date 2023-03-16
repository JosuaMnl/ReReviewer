package com.yosha10.restaurantreview

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>

    /* Post Data Review */
    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id: String, // Key pada field harus sama dengan key JSON dari API
        @Field("name") name: String,
        @Field("review") review: String
    ): Call<PostReviewResponse>
}