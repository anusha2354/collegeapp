package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button button;
    String getName,getRollno,getAdmno,getCollege;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.rollno);
        e3=(EditText)findViewById(R.id.admno);
        e4=(EditText)findViewById(R.id.college);
        button=(Button)findViewById(R.id.submitbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
              getName=e1.getText().toString();
              Toast.makeText(getApplicationContext(),getRollno,Toast.LENGTH_LONG).show();
              getRollno=e2.getText().toString();
              getAdmno=e3.getText().toString();
              getCollege=e4.getText().toString();
              Log.d("username",getName);
              Log.d("roll",getRollno);


            }
        });

    }
}
