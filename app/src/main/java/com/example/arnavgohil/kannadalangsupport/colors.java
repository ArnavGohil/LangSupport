package com.example.arnavgohil.kannadalangsupport;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<abcd> color = new ArrayList<>();
        color.add(new abcd("laal","red",R.drawable.color_red,R.raw.color_red));
        color.add(new abcd("burra","brown",R.drawable.color_brown,R.raw.color_brown));
        color.add(new abcd("kala","black",R.drawable.color_black,R.raw.color_black));
        color.add(new abcd("safed","white",R.drawable.color_white,R.raw.color_white));
        color.add(new abcd("hara","green",R.drawable.color_green,R.raw.color_green));


        for (int i=0;i<color.size();i++)
        {
            Log.v("trans",color.get(i).toString()+"\n");
        }

        ListView lv=(ListView) findViewById(R.id.lvc);
        wordextender items=new wordextender(this,color);
        lv.setAdapter(items);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word=color.get(position);
                MediaPlayer mv=MediaPlayer.create(colors.this,word.getAudRes());
                mv.start();
            }
        });

    }
}
