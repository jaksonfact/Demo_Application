package com.example.demo_application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Arrays.asList;

public class ExperienceActivity extends AppCompatActivity {
    final ArrayList<String> experienceList = new ArrayList<String>(asList("3 Years", "5 Years", "7 Years", "4 Years"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);
        TextView text = (TextView) findViewById(R.id.experienceTextView);
        Intent intent = getIntent();

        text.setText("Experience is " + experienceList.get(getRandomNumberInRange(0,3)));
    }
    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }
}