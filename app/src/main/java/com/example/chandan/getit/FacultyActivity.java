package com.example.chandan.getit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FacultyActivity extends AppCompatActivity {
    Button facultyAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        Button facultyAdd=(Button)findViewById(R.id.People);

    }

    public void facultyAdd(View view){
        Intent intent=new Intent(this,SelectAddActivity.class);
        startActivity(intent);

    }


}
