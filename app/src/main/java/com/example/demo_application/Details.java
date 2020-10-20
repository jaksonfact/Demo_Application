package com.example.demo_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView text = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        text.setText("Name : " +str);
        loadFragment(new ProfessionFragment());

    }
    private void loadFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.detailLayout,fragment,fragment.getTag());
        fragmentTransaction.commit();


    }
}