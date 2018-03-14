package com.example.gordo.greenhomeadvisor_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GreenHomeAdvisor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_home_advisor);
    }

    public void LoginClicked(View view){
        EditText usernameEntry = findViewById(R.id.UsernameEntry);
        EditText passwordEntry = findViewById(R.id.PasswordEntry);
        TextView errorMessage = findViewById(R.id.ErrorMessage);
        errorMessage.setText("");

        String username = usernameEntry.getText().toString();
        String password = passwordEntry.getText().toString();

        if (username.isEmpty() || password.isEmpty()){
            String message = "Please enter a valid username and password.";
            errorMessage.setText(message);
        }
        else {  //ADD AUTHENTICATION
            Intent startMenu = new Intent(this, menu_green_home_advisor.class);
            startActivity(startMenu);
        }
    }

    public void RegisterClicked(View view){
        Intent registrationPage = new Intent(this, registration_green_home_advisor.class);
        startActivity(registrationPage);
    }

}
