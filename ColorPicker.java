package com.example.registration_form;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColorPicker extends AppCompatActivity {
    Spinner colorSpinner;
    TextView colorDisplay;
    Button gotogalley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color_picker);

        colorSpinner=(Spinner) findViewById(R.id.colorSpinner);
        colorDisplay=(TextView) findViewById(R.id.colorDisplay);
        gotogalley=(Button)findViewById(R.id.gotogalley);

        String [] colors={"Red","Green","Blue","Cyan","Yellow"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,colors);
        colorSpinner.setAdapter(adapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i)
                {
                    case 0:
                        colorDisplay.setBackgroundColor(Color.RED);
                        break;
                    case 1:
                        colorDisplay.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:
                        colorDisplay.setBackgroundColor(Color.BLUE);
                        break;
                    case 3:
                        colorDisplay.setBackgroundColor(Color.CYAN);
                        break;
                    case 4:
                        colorDisplay.setBackgroundColor(Color.YELLOW);
                        break;
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        gotogalley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to ImageGallery
                Intent intent = new Intent(ColorPicker.this, GalleryApp.class);
                startActivity(intent);
            }
        });



    }
}