package com.testapp.masterpython.Examples;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testapp.masterpython.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Function extends Fragment {


    public Function() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.x_function, container, false);
    }

}
