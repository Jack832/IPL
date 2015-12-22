package com.example.test4.ipl;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    ListView lv;
    int movie_resources[]={R.drawable.raina,R.drawable.finch,R.drawable.jadeja,R.drawable.warner,R.drawable.watson};
    String movie_title[];
    adapters app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(android.R.id.list);
        movie_title = getResources().getStringArray(R.array.movie_title);
        int i=0;
        app= new adapters(getApplicationContext(),R.layout.model);
        lv.setAdapter(app);
        for (String titles:movie_title)
        {
            customAdapter cA=new customAdapter(movie_resources[i],titles);
            app.add(cA);
            i++;
        }


    }

}
