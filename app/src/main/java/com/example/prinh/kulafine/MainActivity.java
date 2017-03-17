package com.example.prinh.kulafine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button david,prince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prince = (Button)findViewById(R.id.button2);
        david = (Button)findViewById(R.id.button);

        prince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        david.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Your activities.
            }
        });

    }
}
