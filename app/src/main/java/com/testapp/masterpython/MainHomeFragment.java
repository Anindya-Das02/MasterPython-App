package com.testapp.masterpython;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainHomeFragment extends Fragment {

    Button btn_ide,btn_concepts,btn_faqs,btn_ref,btn_abt_us,btn_ex;


    public MainHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_home, container, false);
        btn_ide = view.findViewById(R.id.btn_ide);
        btn_concepts = view.findViewById(R.id.btn_concepts);
        btn_ex = view.findViewById(R.id.btn_example);
        btn_faqs = view.findViewById(R.id.btn_faqs);
        btn_ref = view.findViewById(R.id.btn_refs);
        btn_abt_us = view.findViewById(R.id.btn_aboutus);
        btn_ide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new IdesFragment(),null).commit();
            }
        });

        btn_concepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ConceptsFragment(),null).commit();
            }
        });
        btn_faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Faq_Fragment(),null).commit();
            }
        });

        btn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReferenceFragment(),null).commit();
            }
        });
        btn_abt_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AboutUs_Fragment(),null).commit();
            }
        });
        btn_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ExampleFragment(),null).commit();
            }
        });



        return view;
    }



}
