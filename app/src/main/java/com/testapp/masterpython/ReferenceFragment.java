package com.testapp.masterpython;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReferenceFragment extends Fragment {

    ListView listView;


    public ReferenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reference, container, false);
        listView = view.findViewById(R.id.refs_list);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.refs_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);



        return view;
    }

}
