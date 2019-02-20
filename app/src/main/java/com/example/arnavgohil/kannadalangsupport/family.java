package com.example.arnavgohil.kannadalangsupport;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onStop() {
        super.onStop();
        releaseInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final ArrayList<abcd> family=new ArrayList<>();
        family.add(new abcd("papa","dad",R.drawable.family_father,R.raw.family_father));
        family.add(new abcd("Ma","Mom",R.drawable.family_mother,R.raw.family_mother));
        family.add(new abcd("Beta","Son",R.drawable.family_son,R.raw.family_son));
        family.add(new abcd("Beti","Daughter",R.drawable.family_daughter,R.raw.family_daughter));
        family.add(new abcd("nani","grandmom",R.drawable.family_grandmother,R.raw.family_grandmother));
        family.add(new abcd("nana","granddad",R.drawable.family_grandfather,R.raw.family_grandfather));

        ListView list=(ListView) findViewById(R.id.lvf);
        wordextender item=new wordextender(this,family);
        list.setAdapter(item);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word=family.get(position);
                MediaPlayer mv=MediaPlayer.create(family.this,word.getAudRes());
                mv.start();
            }
        });



    }
}
