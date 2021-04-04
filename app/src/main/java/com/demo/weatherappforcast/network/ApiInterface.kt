import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {

    @GET("weather")
   suspend fun getWeatherByLocation(
        @Query("lat")
        latitude:String,
        @Query("lon")
        longitude:String
    ):Response<ResponseWeather>



}