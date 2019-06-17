package com.example.signup_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashBoardActivity extends AppCompatActivity {

    TextView txtInfo;
    String firstName,lastName,email,password,conPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        firstName = getIntent().getExtras().getString("FIRSTNAME");
        lastName = getIntent().getExtras().getString("LASTNAME");
        email = getIntent().getExtras().getString("EMAIL");
        password = getIntent().getExtras().getString("PASSWORD");
        conPassword = getIntent().getExtras().getString("CONPASSWORD");

        txtInfo = findViewById(R.id.txtInfo);
        txtInfo.setText("Firstname : "+firstName+'\n'+"Lastname : "+lastName+'\n'+"Email Address : "+email+'\n'+"Password : "+password+'\n'+"Confirm Password : "+conPassword);
    }
}
