package com.testapp.masterpython;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.testapp.masterpython.Examples.ClassesObj;
import com.testapp.masterpython.Examples.Function;
import com.testapp.masterpython.Examples.Lists;
import com.testapp.masterpython.Examples.Loops;
import com.testapp.masterpython.Examples.Maximum;
import com.testapp.masterpython.Examples.PositiveNegative;
import com.testapp.masterpython.Examples.Triangle;

public class ExampleFragment extends Fragment {

    ListView listView;

    public ExampleFragment(){

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_example, container, false);
        listView = view.findViewById(R.id.example_list);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.ExampleList,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                if(pos==0){
                    ft.replace(R.id.fragment_container,new Triangle(),null).commit();
                }
                if(pos==1){
                    ft.replace(R.id.fragment_container,new PositiveNegative(),null).commit();
                }
                if(pos==2){
                    ft.replace(R.id.fragment_container,new Maximum(),null).commit();
                }
                if(pos==4){
                    ft.replace(R.id.fragment_container,new Loops(),null).commit();
                }
                if(pos==5){
                    ft.replace(R.id.fragment_container,new Lists(),null).commit();
                }
                if(pos==6){
                    ft.replace(R.id.fragment_container,new Function(),null).commit();
                }
                if(pos==7){
                    ft.replace(R.id.fragment_container,new ClassesObj(),null).commit();
                }

            }
        });
        return view;
    }


}
