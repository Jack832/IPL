package com.example.test4.ipl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bridgelabz4 on 16/12/15.
 */
public class adapters extends ArrayAdapter {
    ArrayList list = new ArrayList();
    public adapters(Context context, int resource) {
        super(context, resource);
    }
    static  class Holder{
        ImageView imges;
        TextView t1;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row= convertView;
        Holder hold;
        if(convertView == null)
        {
            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.model,parent,false);
            hold=new Holder();
            hold.imges=(ImageView)row.findViewById(R.id.teams);
            hold.t1=(TextView)row.findViewById(R.id.movie_title1);
            row.setTag(hold);
        }
        else{
            hold=(Holder)row.getTag();
        }
        customAdapter adap;
        adap=(customAdapter)this.getItem(position);
        hold.imges.setImageResource(adap.getMovie_resources());
        hold.t1.setText(adap.getMovie_title());
        return row;
    }
}
