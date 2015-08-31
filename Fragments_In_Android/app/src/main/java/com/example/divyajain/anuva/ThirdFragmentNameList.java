package com.example.divyajain.anuva;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Divya Jain on 7/28/2015.
 */
public class ThirdFragmentNameList extends Fragment {

    ArrayList<String> nameList, colorList;
    SecondCustomListAdapter aAdpt;
    Button addButton;
    EditText nameText, colorText;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.third_fragment, container, false);
        ListView list = (ListView) view.findViewById(R.id.listView2);
        addButton = (Button)view.findViewById(R.id.Button01);
        nameText = (EditText)view.findViewById(R.id.EditText01);
        colorText = (EditText)view.findViewById(R.id.EditText02);
        nameList = new ArrayList<String>();
        colorList = new ArrayList<String>();
        // listItems.add(new String("0"));
        aAdpt = new SecondCustomListAdapter(getActivity(),nameList, colorList );
        list.setAdapter(aAdpt);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String name = nameText.getText().toString();
                String color = colorText.getText().toString();

                nameList.add(name);
                colorList.add(color);
                nameText.setText("");
                colorText.setText("");
//                getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
                aAdpt.notifyDataSetChanged();
            }

        });
        return view;

    }

}
