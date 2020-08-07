package com.example.marks_recorder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
   // public Button button;

    // public static final String EXTRA_MESSAGE = "com.example.Marks_Recorder.MESSAGE";
    //  private android.widget.Button Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       Button button2 = (Button)findViewById(R.id.button2);
      Button  button3 = (Button)findViewById(R.id.button3);
      Button button4 = (Button)findViewById(R.id.button4);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this, Third_activity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this, FourthActitvity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });



    }
}