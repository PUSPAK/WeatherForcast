
import LocationData
import RequestCompleteListener



interface LocationProviderInterface {
    fun getUserCurrentLocation(callback:RequestCompleteListener<LocationData>)
}