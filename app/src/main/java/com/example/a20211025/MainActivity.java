package com.example.a20211025;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText heightEditText = findViewById(R.id.height_content);
        EditText weightEditText = findViewById(R.id.weight_content);


        Button cal_btn = findViewById(R.id.cal_button);
        cal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    float height = Float.parseFloat(heightEditText.getText().toString())/100;
                    float weight = Float.parseFloat(weightEditText.getText().toString());

                    float result = weight / (height * height);

                    Toast toast = Toast.makeText(
                            MainActivity.this,
                            Float.toString(result),
                            Toast.LENGTH_SHORT);
                    toast.show();

                } catch (
                        NumberFormatException e
                ) {
                    //
                }

            }
        });
    }
}