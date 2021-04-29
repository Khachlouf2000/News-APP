package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

     RadioGroup radioGroup ;
     RadioButton radioButton ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radioGroup = findViewById(R.id.radiogroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.loc_id : {
                 startActivity(new Intent(MainActivity2.this , local.class));
                    }
                    case R.id.pol_id : {
                        startActivity(new Intent(MainActivity2.this , politique.class));
                    }
                    case R.id.sport_id : {
                        startActivity(new Intent(MainActivity2.this , sport.class));
                    }
                }
            }
        });








    }

}