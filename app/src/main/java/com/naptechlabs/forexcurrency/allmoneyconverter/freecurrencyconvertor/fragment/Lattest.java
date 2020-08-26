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

import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.viewmodel.LattestViewModel;
import com.naptechlabs.forexcurrency.allmoneyconverter.freecurrencyconvertor.R;

public class Lattest extends Fragment {

    private LattestViewModel homeViewModel;
    TextView pr1TV,pr2TV,pr3TV,pr4TV,pr5TV,pr6TV,pr7TV,pr8TV,pr9TV;

    TextView pt1TV,pt2TV,pt3TV,pt4TV,pt5TV,pt6TV,pt7TV,pt8TV,pt9TV;

    TextView pm1TV,pm2TV,pm3TV,pm4TV,pm5TV,pm6TV,pm7TV,pm8TV,pm9TV;
    public static Lattest newInstance() {
        return new Lattest();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lattest_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        homeViewModel = ViewModelProviders.of(this).get(LattestViewModel.class);
        // TODO: Use the ViewModel
    }
    private void datagetFun() {
        homeViewModel.getTextrate1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {

                pr1TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm1TV.setText((sm));
            }
        });
        homeViewModel.getTexttime1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt1TV.setText(s);

            }
        });
        homeViewModel.getTextreate2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr2TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm2TV.setText((sm));

            }
        });
        homeViewModel.getTexttime2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt2TV.setText(s);
            }
        });
        homeViewModel.getTextrate3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr3TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm3TV.setText((sm));
            }
        });
        homeViewModel.getTexttime3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt3TV.setText(s);
            }
        });
        homeViewModel.getTextreate4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr4TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm4TV.setText((sm));
            }
        });
        homeViewModel.getTexttime4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt4TV.setText(s);
            }
        });
        homeViewModel.getTextrate5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr5TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm5TV.setText((sm));
            }
        });
        homeViewModel.getTexttime5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt5TV.setText(s);
            }
        });
        homeViewModel.getTextreate6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr6TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm6TV.setText((sm));
            }
        });
        homeViewModel.getTexttime6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt6TV.setText(s);
            }
        });

        homeViewModel.getTextrate7().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr7TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm7TV.setText((sm));
            }
        });
        homeViewModel.getTexttime7().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt7TV.setText(s);
            }
        });
        homeViewModel.getTextreate8().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr8TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm8TV.setText((sm));
            }
        });
        homeViewModel.getTexttime8().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt8TV.setText(s);
            }
        });
        homeViewModel.getTextreate9().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                pr9TV.setText(s);
                float i = 1/Float.parseFloat(s);
                String sm = String.valueOf(i);
                pm9TV.setText((sm));
            }
        });
        homeViewModel.getTexttime9().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                pt9TV.setText(s);
            }
        });
    }

    private void init(View view) {
        pr1TV = view.findViewById(R.id.pr1TvId);
        pr2TV = view.findViewById(R.id.pr2TvId);
        pr3TV = view.findViewById(R.id.pr3TvId);
        pr4TV = view.findViewById(R.id.pr4TvId);
        pr5TV = view.findViewById(R.id.pr5TvId);
        pr6TV = view.findViewById(R.id.pr6TvId);
        pr7TV = view.findViewById(R.id.pr7TvId);
        pr8TV = view.findViewById(R.id.pr8TvId);
        pr9TV = view.findViewById(R.id.pr9TvId);


        pt1TV = view.findViewById(R.id.pt1TvId);
        pt2TV = view.findViewById(R.id.pt2TvId);
        pt3TV = view.findViewById(R.id.pt3TvId);
        pt4TV = view.findViewById(R.id.pt4TvId);
        pt5TV = view.findViewById(R.id.pt5TvId);
        pt6TV = view.findViewById(R.id.pt6TvId);
        pt7TV = view.findViewById(R.id.pt7TvId);
        pt8TV = view.findViewById(R.id.pt8TvId);
        pt9TV = view.findViewById(R.id.pt9TvId);


        /*pm1TV = view.findViewById(R.id.pm1TVID);
        pm2TV = view.findViewById(R.id.pm2TVID);
        pm3TV = view.findViewById(R.id.pm3TVID);
        pm4TV = view.findViewById(R.id.pm4TVID);
        pm5TV = view.findViewById(R.id.pm5TVID);
        pm6TV = view.findViewById(R.id.pm6TVID);
        pm7TV = view.findViewById(R.id.pm7TVID);
        pm8TV = view.findViewById(R.id.pm8TVID);
        pm9TV = view.findViewById(R.id.pm9TVID);*/
    }
}