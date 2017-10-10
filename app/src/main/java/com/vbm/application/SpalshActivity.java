package com.vbm.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SpalshActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        Toast.makeText(this, "hiiiii", Toast.LENGTH_SHORT).show();

        System.out.print("xcvvv");

    }



}
