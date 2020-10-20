package com.example.demo_application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Arrays.asList;

public class HobbyActivity extends AppCompatActivity {
    final ArrayList<String> hobbyList = new ArrayList<String>(asList("reading Books", "playing Footboll", "drawing and painting", "listerning to music"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);
        TextView text = (TextView) findViewById(R.id.hobbyTextView);
      //  Intent intent = getIntent();

        text.setText("Hobby is " + hobbyList.get(getRandomNumberInRange(0,3)));
    }
    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }
}