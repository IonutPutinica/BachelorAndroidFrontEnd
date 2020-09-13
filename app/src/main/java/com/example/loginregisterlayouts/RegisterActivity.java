package com.example.loginregisterlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView loginMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

        loginMessage = findViewById(R.id.LoginMessage);
        loginMessage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
        {
            openLoginActivity();
        }
    }



        );

}
    public void openLoginActivity()
    {
        Intent openLoginIntent = new Intent(this, LoginActivity.class);
        startActivity(openLoginIntent);

    }
}





