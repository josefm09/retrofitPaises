package registration.testing.firebase.com.retrofitmvp.Model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by flariz on 19/03/18.
 */

public interface FlagCountryResponse {
    @GET("/be/flat/64.png")
    Call getFlag();
}
