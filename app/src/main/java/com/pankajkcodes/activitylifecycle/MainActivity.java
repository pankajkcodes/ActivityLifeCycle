package com.pankajkcodes.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.tv.TvContentRating;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the text view
        TV1 = findViewById(R.id.firstAcivity);

        // set onClickListener  on textView
        TV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // method to move one activity to another activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}