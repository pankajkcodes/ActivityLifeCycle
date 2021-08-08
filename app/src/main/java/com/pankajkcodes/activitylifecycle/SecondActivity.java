package com.pankajkcodes.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tv1s, tv2s;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize text views
        tv1s = findViewById(R.id.tv1s);
        tv2s = findViewById(R.id.tv2s);

        // set text on text views
        tv1s.setText("This Is Seconds Activity");
        tv2s.setText("Click Here To Go Back");
    }



        // method to move one activity to another activity
    public void goBack(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }

        //  method to show a toast massage
    public void showToast(View view) {
        Toast.makeText(this, "This Is Second Activity", Toast.LENGTH_SHORT).show();
    }
}