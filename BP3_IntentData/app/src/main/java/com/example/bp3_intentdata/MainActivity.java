package com.example.bp3_intentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
implements View.onClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMovieWithDataActivity =
                findViewById(R.id.btn_move_activity_data);
        btnMovieWithDataActivity.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_move_activity_data){
            Intent moveIntent = new Intent(MainActivity.this, Data Diterima.class);
            startActivity(moveIntent);

        }
    }
}