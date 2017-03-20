package com.example.chandan.getit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {
    EditText name;
    EditText phone;
    Button login;
    Spinner designation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText name=(EditText)findViewById(R.id.name);
        EditText phone=(EditText)findViewById(R.id.phonenumber);
        Button login=(Button)findViewById(R.id.login);
        Spinner designation=(Spinner)findViewById(R.id.designation);

    }
    public void onLoginClick(View view){

    }
}
