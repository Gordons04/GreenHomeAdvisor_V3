package com.example.gordo.greenhomeadvisor_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class registration_green_home_advisor extends AppCompatActivity {

    public EditText username;
    public EditText password;
    public EditText verifyPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_green_home_advisor);
    }

    public void SubmitClicked(View view){

    }

    public void ExitClicked(View view){
        Intent loginScreen = new Intent(this, GreenHomeAdvisor.class);
        startActivity(loginScreen);
    }
}
