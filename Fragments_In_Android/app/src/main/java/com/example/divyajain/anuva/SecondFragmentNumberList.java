package com.example.divyajain.anuva;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Divya Jain on 7/28/2015.
 */
public class SecondFragmentNumberList extends Fragment {
//    final String[] items = new String[]{};
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    Button addButton;
    static int number = 0;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container,false);
        ListView list = (ListView)view.findViewById(R.id.listView1);
        addButton = (Button)view.findViewById(R.id.addButton);
        listItems = new ArrayList<String>();
       // listItems.add(new String("0"));
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listItems);
        list.setAdapter(adapter);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(number == 20)
                {
                    number = 0;
                }
                String newNumber = Integer.toString(number + 1);
                number += 1;
                listItems.add(newNumber);
                adapter.notifyDataSetChanged();
           }

        });
        return view;

    }
}
