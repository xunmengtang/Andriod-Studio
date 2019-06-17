package com.example.signup_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity
{
    EditText firstName,lastName,emailAdd,passWord,conPassword;
    Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastname);
        emailAdd = findViewById(R.id.email);
        passWord = findViewById(R.id.password);
        conPassword = findViewById(R.id.confirmpassword);

    }
    public void OnClickBtn(View v){

        String firtname =firstName.getText().toString();
        String lastname = lastName.getText().toString();
        String email = emailAdd.getText().toString();
        String password = passWord.getText().toString();
        String conpassword = conPassword.getText().toString();

        Intent intent = new Intent(this,DashBoardActivity.class);
        intent.putExtra("FIRSTNAME",firtname);
        intent.putExtra("LASTNAME",lastname);
        intent.putExtra("EMAIL",email);
        intent.putExtra("PASSWORD",password);
        intent.putExtra("CONPASSWORD",conpassword);
        startActivity(intent);

        Toast.makeText(this, "Successfully!", Toast.LENGTH_SHORT).show();
    }
}
