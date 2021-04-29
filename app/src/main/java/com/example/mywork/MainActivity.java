package com.example.mywork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
     int j=5;
    Button bott ;
    EditText texte ;
    EditText mdp ;
    TextView number;
    FirebaseAuth ath ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         initviews();

         initEvents();



    }
       void initviews(){
           bott = findViewById(R.id.bot);
           texte = findViewById(R.id.vtext);
           mdp = findViewById(R.id.pass);
           bott.setTextColor(Color.YELLOW);
           number=findViewById(R.id.num);
           ath = FirebaseAuth.getInstance();
       }
       void initEvents(){

           bott.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {





                   ath.signInWithEmailAndPassword(texte.getText().toString(),mdp.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                           if(task.isSuccessful()){
                               startActivity(new Intent(MainActivity.this,MainActivity2.class));
                 }else {
                               bott.setText("Again");
                               bott.setTextColor(Color.CYAN);
                               bott.setBackgroundColor(Color.BLACK);

                           }
                   }





           });

       }

    }
           );  }
    }