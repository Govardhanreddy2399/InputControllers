package com.example.inputcontrollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SeconSrenn.class);
                startActivity(i);
            }
        });
    }

    public void selectimage(View view) {
        Toast.makeText(getApplicationContext(), "image is kabbadi", Toast.LENGTH_SHORT).show();
    }
}