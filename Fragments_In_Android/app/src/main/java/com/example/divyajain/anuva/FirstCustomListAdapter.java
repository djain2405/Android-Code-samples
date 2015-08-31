package com.example.divyajain.anuva;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Divya Jain on 7/28/2015.
 */
public class FirstCustomListAdapter extends ArrayAdapter<Integer> {

private List<Integer> imageList;
private Context context;

public FirstCustomListAdapter(List<Integer> imageList, Context ctx){
        super(ctx,R.layout.first_listview_layout,imageList);
        this.imageList =imageList;
        this.context=ctx;
        }

public View getView(int position,View convertView,ViewGroup parent){

        // First let's verify the convertView is not null
        if(convertView==null){
        // This a new view we inflate the new layout
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.first_listview_layout,parent,false);
        }

        Integer p= imageList.get(position);
        ImageView v = (ImageView)convertView.findViewById(R.id.randomImage);
        v.setImageResource(p.intValue());

        return convertView;
        }
}

