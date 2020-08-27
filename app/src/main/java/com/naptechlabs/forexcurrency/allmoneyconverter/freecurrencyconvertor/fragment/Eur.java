package com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.R;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.viewmodel.EurViewModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;

public class Eur extends Fragment {
    public String url = "https://api.exchangeratesapi.io/latest";

    private EurViewModel dashboardViewModel;
    TextView seekbarTxt;
    SeekBar seekBar;
    DecimalFormat df;

    TextView e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19,
            e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32;
    private Double seekvalu = 1.0;

    public static Eur newInstance() {
        return new Eur();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.eur_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
      //  dashboardViewModel = ViewModelProviders.of(this).get(EurViewModel.class);
        // TODO: Use the ViewModel
        // dataFound();
        df = new DecimalFormat("#.##");
        getdata();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekvalu = Double.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekbarTxt.setText(String.valueOf(seekvalu));
                getdata();
            }
        });
    }

    public void getdata() {

        RequestQueue queue = Volley.newRequestQueue(getContext());

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            JSONObject object = jsonObject.getJSONObject("rates");
                            String ss = object.getString("CAD");
                            Double i = Double.parseDouble(ss);
                            Double r = i * seekvalu;
                            r=  Double.valueOf(df.format(r));
                            e1.setText(String.valueOf(r));


                            String ss2 = object.getString("HKD");
                            Double i2 = Double.parseDouble(ss2);
                            Double r2 = i2 * seekvalu;
                            r2=  Double.valueOf(df.format(r2));
                            e2.setText(String.valueOf(r2));

                            String ss3 = object.getString("ISK");
                            Double i3 = Double.parseDouble(ss3);
                            Double r3 = i3 * seekvalu;
                            r3=  Double.valueOf(df.format(r3));
                            e3.setText(String.valueOf(r3));

                            String ss4 = object.getString("PHP");
                            Double i4 = Double.parseDouble(ss4);
                            Double r4 = i4 * seekvalu;
                            r4=  Double.valueOf(df.format(r4));
                            e4.setText(String.valueOf(r4));

                            String ss5 = object.getString("DKK");
                            Double i5 = Double.parseDouble(ss5);
                            Double r5 = i5 * seekvalu;
                            r5=  Double.valueOf(df.format(r5));
                            e5.setText(String.valueOf(r5));

                            String ss6 = object.getString("HUF");
                            Double i6 = Double.parseDouble(ss6);
                            Double r6 = i6 * seekvalu;
                            r6=  Double.valueOf(df.format(r6));
                            e6.setText(String.valueOf(r6));

                            String ss7 = object.getString("CZK");
                            Double i7 = Double.parseDouble(ss7);
                            Double r7 = i7 * seekvalu;
                            r7=  Double.valueOf(df.format(r7));
                            e7.setText(String.valueOf(r7));

                            String ss8 = object.getString("AUD");
                            Double i8 = Double.parseDouble(ss8);
                            Double r8 = i8 * seekvalu;
                            r8=  Double.valueOf(df.format(r8));
                            e8.setText(String.valueOf(r8));

                            String ss9 = object.getString("RON");
                            Double i9 = Double.parseDouble(ss9);
                            Double r9 = i9 * seekvalu;
                            r9=  Double.valueOf(df.format(r9));
                            e9.setText(String.valueOf(r9));

                            String ss10 = object.getString("SEK");
                            Double i10 = Double.parseDouble(ss10);
                            Double r10 = i10 * seekvalu;
                            r10=  Double.valueOf(df.format(r10));
                            e10.setText(String.valueOf(r10));

                            String ss11 = object.getString("IDR");
                            Double i11 = Double.parseDouble(ss11);
                            Double r11 = i11 * seekvalu;
                            r11=  Double.valueOf(df.format(r11));
                            e11.setText(String.valueOf(r11));

                            String ss12 = object.getString("INR");
                            Double i12 = Double.parseDouble(ss12);
                            Double r12 = i12 * seekvalu;
                            r12=  Double.valueOf(df.format(r12));
                            e12.setText(String.valueOf(r12));

                            String ss13 = object.getString("BRL");
                            Double i13 = Double.parseDouble(ss13);
                            Double r13 = i13 * seekvalu;
                            r13=  Double.valueOf(df.format(r13));
                            e13.setText(String.valueOf(r13));

                            String ss14 = object.getString("RUB");
                            Double i14 = Double.parseDouble(ss14);
                            Double r14 = i14 * seekvalu;
                            r14=  Double.valueOf(df.format(r14));
                            e14.setText(String.valueOf(r14));

                            String ss15 = object.getString("HRK");
                            Double i15 = Double.parseDouble(ss15);
                            Double r15 = i15 * seekvalu;
                            r15=  Double.valueOf(df.format(r15));
                            e15.setText(String.valueOf(r15));


                            String ss16 = object.getString("JPY");
                            Double i16 = Double.parseDouble(ss16);
                            Double r16 = i16 * seekvalu;
                            r16=  Double.valueOf(df.format(r16));
                            e16.setText(String.valueOf(r16));

                            String ss17 = object.getString("THB");
                            Double i17 = Double.parseDouble(ss17);
                            Double r17 = i17 * seekvalu;
                            r17=  Double.valueOf(df.format(r17));
                            e17.setText(String.valueOf(r17));

                            String ss18 = object.getString("CHF");
                            Double i18 = Double.parseDouble(ss18);
                            Double r18 = i18 * seekvalu;
                            r18=  Double.valueOf(df.format(r18));
                            e18.setText(String.valueOf(r18));

                            String ss19 = object.getString("SGD");
                            Double i19 = Double.parseDouble(ss19);
                            Double r19 = i19 * seekvalu;
                            r19=  Double.valueOf(df.format(r19));
                            e19.setText(String.valueOf(r19));

                            String ss20 = object.getString("PLN");
                            Double i20 = Double.parseDouble(ss20);
                            Double r20 = i20 * seekvalu;
                            r20=  Double.valueOf(df.format(r20));
                            e20.setText(String.valueOf(r20));


                            String ss21 = object.getString("BGN");
                            Double i21 = Double.parseDouble(ss21);
                            Double r21 = i21 * seekvalu;
                            r21=  Double.valueOf(df.format(r21));
                            e21.setText(String.valueOf(r21));

                            String ss22 = object.getString("TRY");
                            Double i22 = Double.parseDouble(ss22);
                            Double r22 = i22 * seekvalu;
                            r22=  Double.valueOf(df.format(r22));
                            e22.setText(String.valueOf(r22));

                            String ss23 = object.getString("CNY");
                            Double i23 = Double.parseDouble(ss23);
                            Double r23 = i23 * seekvalu;
                            r23=  Double.valueOf(df.format(r23));
                            e23.setText(String.valueOf(r23));

                            String ss24 = object.getString("NOK");
                            Double i24 = Double.parseDouble(ss24);
                            Double r24 = i24 * seekvalu;
                            r24=  Double.valueOf(df.format(r24));
                            e24.setText(String.valueOf(r24));

                            String ss25 = object.getString("NZD");
                            Double i25 = Double.parseDouble(ss25);
                            Double r25 = i25 * seekvalu;
                            r25=  Double.valueOf(df.format(r25));
                            e25.setText(String.valueOf(r25));

                            String ss26 = object.getString("ZAR");
                            Double i26 = Double.parseDouble(ss26);
                            Double r26 = i26 * seekvalu;
                            r26=  Double.valueOf(df.format(r26));
                            e26.setText(String.valueOf(r26));

                            String ss27 = object.getString("USD");
                            Double i27 = Double.parseDouble(ss27);
                            Double r27 = i27 * seekvalu;
                            r27=  Double.valueOf(df.format(r27));
                            e27.setText(String.valueOf(r27));

                            String ss28 = object.getString("MXN");
                            Double i28 = Double.parseDouble(ss28);
                            Double r28 = i28 * seekvalu;
                            r28=  Double.valueOf(df.format(r28));
                            e28.setText(String.valueOf(r28));

                            String ss29 = object.getString("ILS");
                            Double i29 = Double.parseDouble(ss29);
                            Double r29 = i29 * seekvalu;
                            r29=  Double.valueOf(df.format(r29));
                            e29.setText(String.valueOf(r29));

                            String ss30 = object.getString("GBP");
                            Double i30 = Double.parseDouble(ss30);
                            Double r30 = i30 * seekvalu;
                            r30=  Double.valueOf(df.format(r30));
                            e30.setText(String.valueOf(r30));

                            String ss31 = object.getString("KRW");


                            String ss32 = object.getString("MYR");
                            Double i32 = Double.parseDouble(ss32);  Double i31 = Double.parseDouble(ss31);
                            Double r31 = i31 * seekvalu;
                            r31=  Double.valueOf(df.format(r31));
                            e31.setText(String.valueOf(r31));
                            Double r32 = i32 * seekvalu;
                            r32=  Double.valueOf(df.format(r32));
                            e32.setText(String.valueOf(r32));

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

    private void dataFound() {


        dashboardViewModel.getTexte1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e1.setText(s);

            }
        });
        dashboardViewModel.getTexte2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e2.setText(s);
            }
        });
        dashboardViewModel.getTexte3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e3.setText(s);
            }
        });
        dashboardViewModel.getTexte4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e4.setText(s);
            }
        });
        dashboardViewModel.getTexte5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e5.setText(s);
            }
        });
        dashboardViewModel.getTexte6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e6.setText(s);
            }
        });
        dashboardViewModel.getTexte7().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e7.setText(s);
            }
        });
        dashboardViewModel.getTexte8().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e8.setText(s);
            }
        });
        dashboardViewModel.getTexte9().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e9.setText(s);
            }
        });
        dashboardViewModel.getTexte10().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e10.setText(s);
            }
        });
        dashboardViewModel.getTexte11().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e11.setText(s);
            }
        });
        dashboardViewModel.getTexte12().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e12.setText(s);
            }
        });
        dashboardViewModel.getTexte13().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e13.setText(s);
            }
        });
        dashboardViewModel.getTexte14().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e14.setText(s);
            }
        });
        dashboardViewModel.getTexte15().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e15.setText(s);
            }
        });
        dashboardViewModel.getTexte16().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e16.setText(s);
            }
        });
        dashboardViewModel.getTexte17().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e17.setText(s);
            }
        });
        dashboardViewModel.getTexte18().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e18.setText(s);
            }
        });
        dashboardViewModel.getTexte19().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e19.setText(s);
            }
        });
        dashboardViewModel.getTexte20().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e20.setText(s);
            }
        });
        dashboardViewModel.getTexte21().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e21.setText(s);
            }
        });
        dashboardViewModel.getTexte22().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e22.setText(s);
            }
        });
        dashboardViewModel.getTexte23().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e23.setText(s);
            }
        });
        dashboardViewModel.getTexte24().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e24.setText(s);
            }
        });
        dashboardViewModel.getTexte25().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e25.setText(s);
            }
        });
        dashboardViewModel.getTexte26().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e26.setText(s);
            }
        });
        dashboardViewModel.getTexte27().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e27.setText(s);
            }
        });
        dashboardViewModel.getTexte28().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e28.setText(s);
            }
        });
        dashboardViewModel.getTexte29().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e29.setText(s);
            }
        });
        dashboardViewModel.getTexte30().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e30.setText(s);
            }
        });
        dashboardViewModel.getTexte31().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e31.setText(s);
            }
        });
        dashboardViewModel.getTexte32().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e32.setText(s);
            }
        });
    }



    private void init(View view) {
        seekbarTxt = view.findViewById(R.id.seekbarTxt);
        seekBar = view.findViewById(R.id.simpleSeekBar);
        e1 = view.findViewById(R.id.e1TvId);
        e2 = view.findViewById(R.id.e2TvId);
        e3 = view.findViewById(R.id.e3TvId);
        e4 = view.findViewById(R.id.e4TvId);
        e5 = view.findViewById(R.id.e5TvId);
        e6 = view.findViewById(R.id.e6TvId);
        e7 = view.findViewById(R.id.e7TvId);
        e8 = view.findViewById(R.id.e8TvId);
        e9 = view.findViewById(R.id.e9TvId);
        e10 = view.findViewById(R.id.e10TvId);
        e11 = view.findViewById(R.id.e11TvId);
        e12 = view.findViewById(R.id.e12TvId);
        e13 = view.findViewById(R.id.e13TvId);
        e14 = view.findViewById(R.id.e14TvId);
        e15 = view.findViewById(R.id.e15TvId);
        e16 = view.findViewById(R.id.e16TvId);
        e17 = view.findViewById(R.id.e17TvId);
        e18 = view.findViewById(R.id.e18TvId);
        e19 = view.findViewById(R.id.e19TvId);
        e20 = view.findViewById(R.id.e20TvId);
        e21 = view.findViewById(R.id.e21TvId);
        e22 = view.findViewById(R.id.e22TvId);
        e23 = view.findViewById(R.id.e23TvId);
        e24 = view.findViewById(R.id.e24TvId);
        e25 = view.findViewById(R.id.e25TvId);
        e26 = view.findViewById(R.id.e26TvId);
        e27 = view.findViewById(R.id.e27TvId);
        e28 = view.findViewById(R.id.e28TvId);
        e29 = view.findViewById(R.id.e29TvId);
        e30 = view.findViewById(R.id.e30TvId);
        e31 = view.findViewById(R.id.e31TvId);
        e32 = view.findViewById(R.id.e32TvId);

    }
}

