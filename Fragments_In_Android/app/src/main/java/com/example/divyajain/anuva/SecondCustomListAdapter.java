package com.example.divyajain.anuva;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Divya Jain on 7/28/2015.
 */
public class SecondCustomListAdapter extends ArrayAdapter<String> {

    private List<String> nameList;
    private List<String> colorList;
    private Context context;

    public SecondCustomListAdapter(Context context, List<String> nameList, List<String> colorList) {
        super(context, R.layout.second_listview_layout, nameList);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.nameList=nameList;
        this.colorList=colorList;
    }

    public View getView(int position,View convertView,ViewGroup parent){

        // First let's verify the convertView is not null
        if(convertView==null){
            // This a new view we inflate the new layout
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.second_listview_layout,parent,false);
        }

        String name = nameList.get(position);
        String colorName = colorList.get(position);
        TextView nameText = (TextView)convertView.findViewById(R.id.nameTextView);
        nameText.setText(name);
        ImageView v = (ImageView)convertView.findViewById(R.id.colorImage);
        v.setBackgroundColor(Color.parseColor(colorName));
        return convertView;
    }

}
