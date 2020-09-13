package com.example.loginregisterlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    TextView registerMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        registerMessage = findViewById(R.id.RegisterMessage);
        registerMessage.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   openRegisterActivity();
                                               }
                                           }
        );

    }

    public void openRegisterActivity() {
        Intent openRegisterIntent = new Intent(this, RegisterActivity.class);
        startActivity(openRegisterIntent);
    }


    }
