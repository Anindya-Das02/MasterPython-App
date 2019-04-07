package com.testapp.masterpython;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Variable_Fragment extends Fragment {

    ListView listView;
    Button btn_prev,btn_next;


    public Variable_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_variable_, container, false);
        listView = view.findViewById(R.id.list_vars);
        btn_prev = view.findViewById(R.id.btn_varfrag_prev);
        btn_next = view.findViewById(R.id.btn_varfrag_next);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.var_top_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        btn_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,new HelloWorld_Fragment(),null).commit();
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager  = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_container,new List_Fragment(),null).commit();
            }
        });


        return view;
    }

}
