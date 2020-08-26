package com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
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

public class LattestViewModel extends AndroidViewModel  {

    private MutableLiveData<String> pr1, pt1, pr2, pt2, pr3, pt3, pr4, pt4, pr5, pt5, pr6, pt6, pr7, pt7, pr8, pt8, pr9, pt9;


    public String url = "https://www.freeforexapi.com/api/live?pairs=EURUSD,EURGBP,GBPUSD,USDJPY,AUDUSD,USDCHF,NZDUSD,USDCAD,USDZAR";

    public LattestViewModel(@NonNull Application application) {
        super(application);
        inittext();
        getdata();

    }
    private void inittext() {
        pr1 = new MutableLiveData<>();
        pt1 = new MutableLiveData<>();
        pr2 = new MutableLiveData<>();
        pt2 = new MutableLiveData<>();
        pr3 = new MutableLiveData<>();
        pt3 = new MutableLiveData<>();
        pr4 = new MutableLiveData<>();
        pt4 = new MutableLiveData<>();
        pr5 = new MutableLiveData<>();
        pt5 = new MutableLiveData<>();
        pr6 = new MutableLiveData<>();
        pt6 = new MutableLiveData<>();
        pr7 = new MutableLiveData<>();
        pt7 = new MutableLiveData<>();
        pr8 = new MutableLiveData<>();
        pt8 = new MutableLiveData<>();
        pr9 = new MutableLiveData<>();
        pt9 = new MutableLiveData<>();
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
                            JSONObject object = jsonObject.getJSONObject("rates");
                            JSONObject object1 = object.getJSONObject("EURUSD");
                            String ss = object1.getString("rate");
                            String tt = object1.getString("timestamp");
                            pr1.setValue(ss);
                            pt1.setValue(tt);

                            JSONObject object2 = object.getJSONObject("EURGBP");
                            String ss2 = object2.getString("rate");
                            String tt2 = object2.getString("timestamp");
                            pr2.setValue(ss2);
                            pt2.setValue(tt2);

                            JSONObject object3 = object.getJSONObject("GBPUSD");
                            String ss3 = object3.getString("rate");
                            String tt3 = object3.getString("timestamp");
                            pr3.setValue(ss3);
                            pt3.setValue(tt3);

                            JSONObject object4 = object.getJSONObject("USDJPY");
                            String ss4 = object4.getString("rate");
                            String tt4 = object4.getString("timestamp");
                            pr4.setValue(ss4);
                            pt4.setValue(tt4);

                            JSONObject object5 = object.getJSONObject("USDCHF");
                            String ss5 = object5.getString("rate");
                            String tt5 = object5.getString("timestamp");
                            pr5.setValue(ss5);
                            pt5.setValue(tt5);

                            JSONObject object6 = object.getJSONObject("USDCAD");
                            String ss6 = object6.getString("rate");
                            String tt6 = object6.getString("timestamp");
                            pr6.setValue(ss6);
                            pt6.setValue(tt6);

                            JSONObject object7 = object.getJSONObject("USDZAR");
                            String ss7 = object7.getString("rate");
                            String tt7 = object7.getString("timestamp");
                            pr7.setValue(ss7);
                            pt7.setValue(tt7);

                            JSONObject object8 = object.getJSONObject("AUDUSD");
                            String ss8 = object8.getString("rate");
                            String tt8 = object8.getString("timestamp");
                            pr8.setValue(ss8);
                            pt8.setValue(tt8);

                            JSONObject object9 = object.getJSONObject("NZDUSD");
                            String ss9 = object9.getString("rate");
                            String tt9 = object9.getString("timestamp");
                            pr9.setValue(ss9);
                            pt9.setValue(tt9);


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

    public MutableLiveData<String> getTextrate1() {
        return pr1;
    }

    public MutableLiveData<String> getTexttime1() {
        return pt1;
    }

    public MutableLiveData<String> getTextreate2() {
        return pr2;
    }

    public MutableLiveData<String> getTexttime2() {
        return pt2;
    }

    public MutableLiveData<String> getTextrate3() {
        return pr3;
    }

    public MutableLiveData<String> getTexttime3() {
        return pt3;
    }

    public MutableLiveData<String> getTextreate4() {
        return pr4;
    }

    public MutableLiveData<String> getTexttime4() {
        return pt4;
    }

    public MutableLiveData<String> getTextrate5() {
        return pr5;
    }

    public MutableLiveData<String> getTexttime5() {
        return pt5;
    }

    public MutableLiveData<String> getTextreate6() {
        return pr6;
    }

    public MutableLiveData<String> getTexttime6() {
        return pt6;
    }

    public MutableLiveData<String> getTextrate7() {
        return pr7;
    }

    public MutableLiveData<String> getTexttime7() {
        return pt7;
    }

    public MutableLiveData<String> getTextreate8() {
        return pr8;
    }

    public MutableLiveData<String> getTexttime8() {
        return pt8;
    }

    public MutableLiveData<String> getTextreate9() {
        return pr9;
    }

    public MutableLiveData<String> getTexttime9() {
        return pt9;
    }

}