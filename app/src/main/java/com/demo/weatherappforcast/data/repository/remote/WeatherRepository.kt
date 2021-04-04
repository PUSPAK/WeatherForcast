
class WeatherRepository {

    suspend fun getWeatherByLocation(lat:String,lon:String) = RetrofitClient.api.getWeatherByLocation(lat,lon)
}