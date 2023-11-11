package com.example.myradiobuttondemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupId;
    RadioButton genderButton, maleId,femaleId;
    Button showButtonId;
    TextView resultTxtViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupId = findViewById(R.id.radioGroupId);
        showButtonId = findViewById(R.id.showButtonId);
        resultTxtViewId = findViewById(R.id.resulTxtViewId);

        showButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               int selectedId = radioGroupId.getCheckedRadioButtonId();
               genderButton = findViewById(selectedId);

               String value = genderButton.getText().toString();
               resultTxtViewId.setText("You have selected: "+value);



            }
        });

    }
}