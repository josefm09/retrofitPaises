package registration.testing.firebase.com.retrofitmvp.Core;

import android.content.Context;

import java.util.List;

import registration.testing.firebase.com.retrofitmvp.Model.CountryRes;

public interface GetDataContract {
    interface View{
        void onGetDataSuccess(String message, List<CountryRes> list);
        void onGetDataFailure(String message);
    }
    interface Presenter{
        void getDataFromURL(Context context, String url);
    }
    interface Interactor{
        void initRetrofitCall(Context context, String url);

    }
    interface onGetDataListener{
        void onSuccess(String message, List<CountryRes> list);
        void onFailure(String message);
    }
}
