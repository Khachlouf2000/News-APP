package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity0 extends AppCompatActivity {
    EditText txt ;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        InitViews();
    }
    void InitViews() {
        txt=findViewById(R.id.vtxt);
        startActivity(new Intent(MainActivity0.this , MainActivity.class));


    }


}