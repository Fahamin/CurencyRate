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
import android.widget.TextView;

import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.R;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.viewmodel.UsdViewModel;

import java.text.DecimalFormat;

public class Usd extends Fragment {

    private UsdViewModel dashboardViewModel;
    TextView dateTv;
    DecimalFormat df;
    TextView e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19,
            e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32;

    public static Usd newInstance() {
        return new Usd();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.usd_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dashboardViewModel = ViewModelProviders.of(this).get(UsdViewModel.class);
        // TODO: Use the ViewModel
        df = new DecimalFormat("#.##");
        dataFound();

    }

    private void dataFound() {

        dashboardViewModel.getTexte1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i1 = Double.parseDouble(s);
                i1 = Double.valueOf(df.format(i1));
                e1.setText(String.valueOf(i1));

            }
        });
        dashboardViewModel.getTexte2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i2 = Double.parseDouble(s);
                i2 = Double.valueOf(df.format(i2));
                e2.setText(String.valueOf(i2));
            }
        });
        dashboardViewModel.getTexte3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i3 = Double.parseDouble(s);
                i3 = Double.valueOf(df.format(i3));
                e3.setText(String.valueOf(i3));
            }
        });
        dashboardViewModel.getTexte4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i4 = Double.parseDouble(s);
                i4 = Double.valueOf(df.format(i4));
                e4.setText(String.valueOf(i4));
            }
        });
        dashboardViewModel.getTexte5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i5 = Double.parseDouble(s);
                i5 = Double.valueOf(df.format(i5));
                e5.setText(String.valueOf(i5));
            }
        });
        dashboardViewModel.getTexte6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e6.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte7().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e7.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte8().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e8.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte9().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e9.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte10().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e10.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte11().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e11.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte12().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e12.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte13().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e13.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte14().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e14.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte15().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e15.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte16().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e16.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte17().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e17.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte18().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e18.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte19().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e19.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte20().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e20.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte21().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e21.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte22().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e22.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte23().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e23.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte24().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e24.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte25().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e25.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte26().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e26.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte27().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e27.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte28().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e28.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte29().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e29.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte30().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e30.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte31().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e31.setText(String.valueOf(i6));
            }
        });
        dashboardViewModel.getTexte32().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Double i6 = Double.parseDouble(s);
                i6 = Double.valueOf(df.format(i6));
                e32.setText(String.valueOf(i6));
            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
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

