package com.testapp.masterpython;


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
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConceptsFragment extends Fragment {


    public ConceptsFragment() {
        // Required empty public constructor
    }

    ListView listView;
    //public static String[] conceptList = {"Hello world","Basic input-output","Hello world","Hello world","Hello world","Hello world","Hello world","Hello world","Hello world","Hello world","Hello world","Hello world","end of list"};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_concepts, container, false);
        listView = view.findViewById(R.id.list);
        final ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.Planets,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                if(pos==0){
                    ft.replace(R.id.fragment_container,new Syntax_Fragment(),null);
                    ft.commit();
                }
                if(pos==1){
                    ft.replace(R.id.fragment_container,new HelloWorld_Fragment(),null);
                    ft.commit();
                }
                if(pos==2){
                    ft.replace(R.id.fragment_container,new Variable_Fragment(),null);
                    ft.commit();
                }
                if(pos==3){
                    ft.replace(R.id.fragment_container,new List_Fragment(),null).commit();
                }
                if(pos==4){
                    ft.replace(R.id.fragment_container,new Tuple_Fragment(),null).commit();
                }
                if(pos==5){
                    ft.replace(R.id.fragment_container,new Fragment_Dictionary(),null).commit();
                }
                if(pos==6){
                    ft.replace(R.id.fragment_container,new Conditional_Fragment(),null).commit();
                }
                if(pos==7){
                    ft.replace(R.id.fragment_container,new ForLoop_Fragment(),null).commit();
                }
                if(pos==8){
                    ft.replace(R.id.fragment_container,new WhileLoop_fragment(),null).commit();
                }
                if(pos==9){
                    ft.replace(R.id.fragment_container,new Fragment_Function(),null).commit();
                }
                if(pos==10){
                    ft.replace(R.id.fragment_container,new ClassObj_Fragment(),null).commit();
                }

            }
        });


        return view;
    }

}
