package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText inputMobile = findViewById(R.id.InputMobile);
        Button buttonOTP = findViewById(R.id.OTPSubmit);

        buttonOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputMobile.getText().toString().trim().isEmpty()) {
                    Toast.makeText(Register.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent((getApplicationContext()), Verification.class);
                intent.putExtra("mobile", inputMobile.getText().toString());
                startActivity(intent);
            }
        });

    }
}


