package com.testapp.masterpython;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUs_Fragment extends Fragment {
    ListView listView;


    public AboutUs_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us_, container, false);
        listView = view.findViewById(R.id.list_us);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.creators,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);



        return  view;
    }

}
