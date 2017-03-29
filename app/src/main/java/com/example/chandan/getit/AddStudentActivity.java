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

public class AddStudentActivity extends AppCompatActivity {
    EditText editTextname;
    EditText editTextusn;
    EditText editTextphonenumber;
    EditText editTextemail;
    Spinner spinnerdepartment;
    Spinner spinnersemester;
    Button buttonAdd;

    DatabaseReference databaseStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        databaseStudent= FirebaseDatabase.getInstance().getReference("Student");

        editTextname=(EditText)findViewById(R.id.name);
        editTextusn=(EditText)findViewById(R.id.usn);
        editTextphonenumber=(EditText)findViewById(R.id.phonenumber);
        editTextemail=(EditText)findViewById(R.id.email);
        spinnerdepartment=(Spinner)findViewById(R.id.department);
        spinnersemester=(Spinner)findViewById(R.id.semester);
        buttonAdd=(Button)findViewById(R.id.Add);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudent();

            }
        });
    }


    private void addStudent() {
        String name = editTextname.getText().toString();
        String usn=editTextusn.getText().toString();
        String phone = editTextphonenumber.getText().toString();
        String email = editTextemail.getText().toString();
        String department = spinnerdepartment.getSelectedItem().toString();
        String semester = spinnersemester.getSelectedItem().toString();

        if (!TextUtils.isEmpty(name) || !TextUtils.isEmpty(phone) || !TextUtils.isEmpty(email)) {
            String id= databaseStudent.push().getKey();
            Student student=new Student(id,name,usn,phone,email,department,semester);
            databaseStudent.child(id).setValue(student);
            Toast.makeText(this,"Faculty member added",Toast.LENGTH_LONG).show();

        } else {
            if (TextUtils.isEmpty(name)) {
                Toast.makeText(this, "you should enter a name", Toast.LENGTH_LONG).show();

            }
            else if (TextUtils.isEmpty(usn)) {
                Toast.makeText(this, "you should enter a USN", Toast.LENGTH_LONG).show();

            }else if (TextUtils.isEmpty(phone)) {
                Toast.makeText(this, "you should enter a Phone Number", Toast.LENGTH_LONG).show();

            } else if (TextUtils.isEmpty(email)) {
                Toast.makeText(this, "you should enter an email", Toast.LENGTH_LONG).show();

            }


        }
    }
}
