# WeatherForcast
Weather App using MVVM
Feature
Details Weather Info By Location

Tech Stack
Kotlin
XML
Gradle
Design Pattern
MVVM
IDE Used
Android Studio 

Libraries Used
Kotlin Coroutines
Retrofit2
Lottie Animation

SplashScreenActivity --> MainActivity
In MainActivity,
1. Created LocationProvider object to get current Location
model = LocationProvider(this)
2.ViewModelProvider to get Viewmodel
viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
3.Weather Repository for connecting with Retrofit
weatherRepo = WeatherRepository()
getWeatherByLocation()

4.To setup Gps and check it`s state
GpsUtils(this).turnGPSOn
5.To check if WIFI connection
fun isconnectedToWifi(context: Context)
6.To Setup Observers
setUpObservers()

In MyViewModel Class
1. Mentioned the LiveData Objects
//location live data
val locationLiveData = MutableLiveData<LocationData>()
val locationLiveDataFailure = MutableLiveData<String>()
//weatherByLocation live data
val weatherByLocation = MutableLiveData<Resource<ResponseWeather>>()


2.To get Response from Location
getWeatherByLocation(model:WeatherRepository,lat:String,lon:String)
safeWeatherByLocationFetch()



