package com.example.registration_form;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText password;
    CheckBox cb1;
    Button btn1; //hello

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        password=(EditText) findViewById(R.id.password);
        cb1=(CheckBox) findViewById(R.id.cb1);
        btn1=(Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=name.getText().toString();
                String pass=password.getText().toString();
                boolean isTermsChecked = cb1.isChecked();
                if (username.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (!isTermsChecked) {
                    Toast.makeText(MainActivity.this, "Please agree to the Terms and Conditions", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username:"+username+"\n password:"+pass, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this, quiz_App.class);
                    startActivity(intent);
                }

            }
        });

    }

}
