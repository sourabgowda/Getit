package com.example.chandan.getit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddFacultyActivity extends AppCompatActivity {
EditText editTextname;
    EditText editTextphonenumber ;
    EditText editTextemail;
    Spinner spinnerdepartment;
    Spinner spinnerdesignation;
    Button buttonAdd;

    DatabaseReference databaseFaculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        databaseFaculty= FirebaseDatabase.getInstance().getReference("Faculty");

        editTextname=(EditText)findViewById(R.id.name);
        editTextphonenumber=(EditText)findViewById(R.id.phonenumber);
        editTextemail=(EditText)findViewById(R.id.email);
        spinnerdepartment=(Spinner)findViewById(R.id.department);
        spinnerdesignation=(Spinner)findViewById(R.id.designation);
       buttonAdd=(Button)findViewById(R.id.Add);

       buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaculty();

            }
        });

    }
    private void addFaculty() {
        String name = editTextname.getText().toString();
        String phone = editTextphonenumber.getText().toString();
        String email = editTextemail.getText().toString();
        String department = spinnerdepartment.getSelectedItem().toString();
        String designation = spinnerdesignation.getSelectedItem().toString();

        if (!TextUtils.isEmpty(name) || !TextUtils.isEmpty(phone) || !TextUtils.isEmpty(email)) {
           String id= databaseFaculty.push().getKey();
            Faculty faculty=new Faculty(id,name,phone,email,department,designation);
            databaseFaculty.child(id).setValue(faculty);
            Toast.makeText(this,"Faculty member added",Toast.LENGTH_LONG).show();

        } else {
            if (TextUtils.isEmpty(name)) {
                Toast.makeText(this, "you should enter a name", Toast.LENGTH_LONG).show();

            } else if (TextUtils.isEmpty(phone)) {
                Toast.makeText(this, "you should enter a Phone Number", Toast.LENGTH_LONG).show();

            } else if (TextUtils.isEmpty(email)) {
                Toast.makeText(this, "you should enter an email", Toast.LENGTH_LONG).show();

            }


        }
    }
}
