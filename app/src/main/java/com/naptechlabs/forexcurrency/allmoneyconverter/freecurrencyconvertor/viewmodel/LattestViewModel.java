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

public class LattestViewModel extends AndroidViewModel {

    private MutableLiveData<String> pr1, pt1, pr2, pt2, pr3, pt3, pr4, pt4, pr5, pt5, pr6, pt6, pr7, pt7, pr8, pt8, pr9, pt9;


    public LattestViewModel(@NonNull Application application) {
        super(application);
        inittext();
        getdata();
        getdata2();
        getdata3();
        getdata4();
        getdata5();
        getdata6();
        getdata7();
        getdata8();
        getdata9();
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
        String url = "https://api.exchangerate.host/convert?from=EUR&to=USD";


// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr1.setValue(ss);


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

    public void getdata2() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=EUR&to=GBP";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr2.setValue(ss);


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

    public void getdata3() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=GBP&to=USD";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr3.setValue(ss);


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

    public void getdata4() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=USD&to=JPY";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr4.setValue(ss);


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

    public void getdata5() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=USD&to=CHF";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr5.setValue(ss);


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

    public void getdata6() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=USD&to=CHD";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr6.setValue(ss);


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

    public void getdata7() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=USD&to=ZAR";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr7.setValue(ss);


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

    public void getdata8() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=AUD&to=USD";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr8.setValue(ss);


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
    public void getdata9() {
        RequestQueue queue = Volley.newRequestQueue(getApplication());
        String url = "https://api.exchangerate.host/convert?from=AUD&to=USD";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String ss = jsonObject.getString("result");
                            pr9.setValue(ss);


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