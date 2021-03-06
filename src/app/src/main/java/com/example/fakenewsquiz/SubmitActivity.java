package com.example.fakenewsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubmitActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
    }

    /**
     *  Called when the user taps the True button
     *
     *  todo send mail to expert
     **/
    public void trueAnswer(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = "back";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Called when the user taps the False button
     *
     *  todo send mail to expert
     **/
    public void falseAnswer(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = "back";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
