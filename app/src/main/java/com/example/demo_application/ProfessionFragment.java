package com.example.demo_application;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;


public class ProfessionFragment extends Fragment {
    View view;
    Button profession_Button;
    Button hobby_Button;
    Button experience_Button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profession, container, false);
        // get the reference of Button
        profession_Button = (Button) view.findViewById(R.id.professionButton);
        // perform setOnClickListener on first Button
        hobby_Button = (Button) view.findViewById(R.id.hobbyButton);
        experience_Button = (Button) view.findViewById(R.id.experienceButton);


        profession_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProfessionActivity.class);
                startActivity(intent);
            }
        });

        hobby_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HobbyActivity.class);
                startActivity(intent);
            }
        });

        experience_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ExperienceActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    }