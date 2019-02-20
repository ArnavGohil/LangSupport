package com.example.arnavgohil.kannadalangsupport;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<abcd> number=new ArrayList<abcd>();

        number.add(new abcd("ek","one",R.drawable.number_one,R.raw.number_one));
        number.add(new abcd("do","two",R.drawable.number_two,R.raw.number_two));
        number.add(new abcd("teen","three",R.drawable.number_three,R.raw.number_three));
        number.add(new abcd("char","four",R.drawable.number_four,R.raw.number_four));
        number.add(new abcd("panch","five",R.drawable.number_five,R.raw.number_five));
        number.add(new abcd("che","six",R.drawable.number_six,R.raw.number_six));
        number.add(new abcd("saat","seven",R.drawable.number_seven,R.raw.number_seven));
        number.add(new abcd("ant","eight",R.drawable.number_eight,R.raw.number_eight));
        number.add(new abcd("no","nine",R.drawable.number_nine,R.raw.number_nine));
        number.add(new abcd("dus","ten",R.drawable.number_ten,R.raw.number_ten));


        for (int i=0;i<number.size();i++)
        {
            Log.v("array list","Word at index no. "+i+"is "+number.get(i)+"\n");
        }
        wordextender items;
        items = new wordextender(this, number);
        ListView list=(ListView) findViewById(R.id.lv);
        list.setAdapter(items);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word=number.get(position);
                MediaPlayer mv=MediaPlayer.create(numbers.this,word.getAudRes());
                mv.start();
            }
        });

    }
}
