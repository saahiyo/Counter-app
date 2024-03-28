package com.mycompany.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
    int counter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        counter = 0;
        final TextView textNum = findViewById(R.id.countNum);
        Button countBtn = findViewById(R.id.countBtn);
        Button resetBtn = findViewById(R.id.countReset);
        
      // Button that increase count functionality
        countBtn.setOnClickListener(new View.OnClickListener(){
                @Override 
                public void onClick(View view){
                    counter++;
                    textNum.setText(""+counter);
                }
            });
        
      // Reset button funtionality
        resetBtn.setOnClickListener(new View.OnClickListener(){
                @Override 
                public void onClick(View view){
                    counter=0;
                    textNum.setText(""+counter);
                }
            });
    }
}
