package com.example.mywork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivityregister extends AppCompatActivity {
    EditText mail;
    EditText pas;
    Button but;
    Button but1;
    TextView numb, nom;
    FirebaseAuth lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityregister);

        InitViews();

        InitEvents();

    }


    void InitViews() {
        mail = findViewById(R.id.email);
        pas = findViewById(R.id.passe);
        but = findViewById(R.id.first);
        but1 = findViewById(R.id.second);
        nom = findViewById(R.id.name);
        numb = findViewById(R.id.number);
        lg = FirebaseAuth.getInstance();

    }

    void InitEvents()
    {
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lg.createUserWithEmailAndPassword(mail.getText().toString(), pas.getText().toString()).addOnCompleteListener(MainActivityregister.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(MainActivityregister.this, MainActivity.class));
                        }else {
                            but.setText("There is an error");
                        }
                    }
                });


            }

        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityregister.this, MainActivity.class));

            }
        });
    }
}

