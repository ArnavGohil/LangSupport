package com.example.arnavgohil.kannadalangsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void opennumbers(View view)
    {

        Intent i=new Intent(this,numbers.class);
        startActivity(i);

    }
    public void openfamily(View view)
    {
        Intent i=new Intent(this,family.class);
        startActivity(i);
    }
    public void opencolor(View view)
    {
        Intent i=new Intent(this,colors.class);
        startActivity(i);
    }

}
