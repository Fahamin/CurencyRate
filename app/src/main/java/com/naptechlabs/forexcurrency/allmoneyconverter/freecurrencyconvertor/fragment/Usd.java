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

public class Usd extends Fragment {

    private UsdViewModel dashboardViewModel;
    TextView dateTv;

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
        dataFound();
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
        });   dashboardViewModel.getTexte3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e3.setText(s);
            }
        });   dashboardViewModel.getTexte4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e4.setText(s);
            }
        });   dashboardViewModel.getTexte5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e5.setText(s);
            }
        });   dashboardViewModel.getTexte6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e6.setText(s);
            }
        });   dashboardViewModel.getTexte7().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e7.setText(s);
            }
        });   dashboardViewModel.getTexte8().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e8.setText(s);
            }
        });   dashboardViewModel.getTexte9().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e9.setText(s);
            }
        });   dashboardViewModel.getTexte10().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e10.setText(s);
            }
        });   dashboardViewModel.getTexte11().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e11.setText(s);
            }
        });   dashboardViewModel.getTexte12().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e12.setText(s);
            }
        });   dashboardViewModel.getTexte13().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e13.setText(s);
            }
        });   dashboardViewModel.getTexte14().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e14.setText(s);
            }
        });   dashboardViewModel.getTexte15().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e15.setText(s);
            }
        });   dashboardViewModel.getTexte16().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e16.setText(s);
            }
        });   dashboardViewModel.getTexte17().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e17.setText(s);
            }
        });   dashboardViewModel.getTexte18().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e18.setText(s);
            }
        });   dashboardViewModel.getTexte19().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e19.setText(s);
            }
        });   dashboardViewModel.getTexte20().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e20.setText(s);
            }
        });   dashboardViewModel.getTexte21().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e21.setText(s);
            }
        });   dashboardViewModel.getTexte22().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e22.setText(s);
            }
        });   dashboardViewModel.getTexte23().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e23.setText(s);
            }
        });   dashboardViewModel.getTexte24().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e24.setText(s);
            }
        });   dashboardViewModel.getTexte25().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e25.setText(s);
            }
        });   dashboardViewModel.getTexte26().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e26.setText(s);
            }
        });   dashboardViewModel.getTexte27().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e27.setText(s);
            }
        });   dashboardViewModel.getTexte28().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e28.setText(s);
            }
        });   dashboardViewModel.getTexte29().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e29.setText(s);
            }
        });   dashboardViewModel.getTexte30().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e30.setText(s);
            }
        });   dashboardViewModel.getTexte31().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e31.setText(s);
            }
        });   dashboardViewModel.getTexte32().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                e32.setText(s);
            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        dateTv = view.findViewById(R.id.dateIdTV);
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

