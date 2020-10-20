package com.example.demo_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Arrays.asList;

public class ProfessionActivity extends AppCompatActivity {
    final ArrayList<String> professionList = new ArrayList<String>(asList("Developer", "Homemaker", "Doctor", "Dancer"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profession);
        TextView text = (TextView) findViewById(R.id.professionTextView);
        Intent intent = getIntent();

        text.setText("profession is " + professionList.get(getRandomNumberInRange(0,3)));
    }
    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }
}