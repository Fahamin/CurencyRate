package com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class UsdViewModel extends AndroidViewModel  {

    public String url = "https://api.exchangeratesapi.io/latest?base=USD";

    MutableLiveData<String> e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19,
            e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32;

    public UsdViewModel(@NonNull Application application) {
        super(application);
        getdata();
        iniint();
    }

    public void getdata() {

        RequestQueue queue = Volley.newRequestQueue(getApplication());

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            JSONObject jsonObject = new JSONObject(response);
                            //datet.setValue(jsonObject.getString("date"));

                            JSONObject object = jsonObject.getJSONObject("rates");
                            String ss = object.getString("CAD");
                            e1.setValue(ss);
                            // Toast.makeText(getApplication(), ss, Toast.LENGTH_SHORT).show();
                            String ss2 = object.getString("HKD");
                            e2.setValue(ss2);

                            String ss3 = object.getString("ISK");
                            e3.setValue(ss3);

                            String ss4 = object.getString("PHP");
                            e4.setValue(ss4);

                            String ss5 = object.getString("DKK");
                            e5.setValue(ss5);

                            String ss6 = object.getString("HUF");
                            e6.setValue(ss6);

                            String ss7 = object.getString("CZK");
                            e7.setValue(ss7);

                            String ss8 = object.getString("AUD");
                            e8.setValue(ss8);

                            String ss9 = object.getString("RON");
                            e9.setValue(ss9);

                            String ss10 = object.getString("SEK");
                            e10.setValue(ss10);

                            String ss11 = object.getString("IDR");
                            e11.setValue(ss11);

                            String ss12 = object.getString("INR");
                            e12.setValue(ss12);

                            String ss13 = object.getString("BRL");
                            e13.setValue(ss13);

                            String ss14 = object.getString("RUB");
                            e14.setValue(ss14);

                            String ss15 = object.getString("HRK");
                            e15.setValue(ss15);

                            String ss16 = object.getString("JPY");
                            e16.setValue(ss16);

                            String ss17 = object.getString("THB");
                            e17.setValue(ss17);

                            String ss18 = object.getString("CHF");
                            e18.setValue(ss18);

                            String ss19 = object.getString("SGD");
                            e19.setValue(ss19);

                            String ss20 = object.getString("PLN");
                            e20.setValue(ss20);

                            String ss21 = object.getString("BGN");
                            e21.setValue(ss21);

                            String ss22 = object.getString("TRY");
                            e22.setValue(ss22);

                            String ss23 = object.getString("CNY");
                            e23.setValue(ss23);

                            String ss24 = object.getString("NOK");
                            e24.setValue(ss24);

                            String ss25 = object.getString("NZD");
                            e25.setValue(ss25);

                            String ss26 = object.getString("ZAR");
                            e26.setValue(ss26);

                            String ss27 = object.getString("USD");
                            e27.setValue(ss27);

                            String ss28 = object.getString("MXN");
                            e28.setValue(ss28);

                            String ss29 = object.getString("ILS");
                            e29.setValue(ss29);

                            String ss30 = object.getString("GBP");
                            e30.setValue(ss30);

                            String ss31 = object.getString("KRW");
                            e31.setValue(ss31);

                            String ss32 = object.getString("MYR");
                            e32.setValue(ss32);
                            //  Toast.makeText(getApplication(), ss, Toast.LENGTH_SHORT).show();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }


    /*public LiveData<String> getDATAE() {
        return datet;
    }
*/

    public LiveData<String> getTexte1() {
        return e1;
    }
    public LiveData<String> getTexte2() {
        return e2;
    }
    public LiveData<String> getTexte3() {
        return e3;
    }
    public LiveData<String> getTexte4() {
        return e4; }
    public LiveData<String> getTexte5() {
        return e5;
    }
    public LiveData<String> getTexte6() {
        return e6;
    }
    public LiveData<String> getTexte7() {
        return e7;
    }
    public LiveData<String> getTexte8() {
        return e8;
    }
    public LiveData<String> getTexte9() {
        return e9;
    }
    public LiveData<String> getTexte10() {
        return e10;
    }
    public LiveData<String> getTexte11() {
        return e11;
    }
    public LiveData<String> getTexte12() {
        return e12;
    }
    public LiveData<String> getTexte13() {
        return e13;
    }
    public LiveData<String> getTexte14() {
        return e14;
    }
    public LiveData<String> getTexte15() {
        return e15;
    }
    public LiveData<String> getTexte16() {
        return e16;
    }
    public LiveData<String> getTexte17() {
        return e17;
    }
    public LiveData<String> getTexte18() {
        return e18;
    }
    public LiveData<String> getTexte19() {
        return e19;
    }
    public LiveData<String> getTexte20() {
        return e20;
    }
    public LiveData<String> getTexte21() {
        return e21;
    }
    public LiveData<String> getTexte22() {
        return e22;
    }
    public LiveData<String> getTexte23() {
        return e23;
    }
    public LiveData<String> getTexte24() {
        return e24;
    }
    public LiveData<String> getTexte25() {
        return e25;
    }
    public LiveData<String> getTexte26() {
        return e26;
    }
    public LiveData<String> getTexte27() {
        return e27;
    }
    public LiveData<String> getTexte28() {
        return e28;
    }
    public LiveData<String> getTexte29() {
        return e29;
    }
    public LiveData<String> getTexte30() {
        return e30;
    }
    public LiveData<String> getTexte31() {
        return e31;
    }
    public LiveData<String> getTexte32() {
        return e32;
    }



    private void iniint() {
        //datet = new MutableLiveData<>();
        e1 = new MutableLiveData<>();
        e2 = new MutableLiveData<>();
        e3 = new MutableLiveData<>();
        e4 = new MutableLiveData<>();
        e5 = new MutableLiveData<>();
        e6 = new MutableLiveData<>();
        e7 = new MutableLiveData<>();
        e8 = new MutableLiveData<>();
        e9 = new MutableLiveData<>();
        e10 = new MutableLiveData<>();
        e11 = new MutableLiveData<>();
        e12 = new MutableLiveData<>();
        e13 = new MutableLiveData<>();
        e14 = new MutableLiveData<>();
        e15 = new MutableLiveData<>();
        e16 = new MutableLiveData<>();
        e17 = new MutableLiveData<>();
        e18 = new MutableLiveData<>();
        e19 = new MutableLiveData<>();
        e20 = new MutableLiveData<>();
        e21 = new MutableLiveData<>();
        e22 = new MutableLiveData<>();
        e23 = new MutableLiveData<>();
        e24 = new MutableLiveData<>();
        e25 = new MutableLiveData<>();
        e26 = new MutableLiveData<>();
        e27 = new MutableLiveData<>();
        e28 = new MutableLiveData<>();
        e29 = new MutableLiveData<>();
        e30 = new MutableLiveData<>();
        e31 = new MutableLiveData<>();
        e32 = new MutableLiveData<>();


    }
}
