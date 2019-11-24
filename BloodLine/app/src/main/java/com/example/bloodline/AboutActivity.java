package com.example.bloodline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    private Button group,guide,benefits,acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutblood);


        group = (Button) findViewById(R.id.group);
        guide = (Button) findViewById(R.id.guide);
        benefits = (Button) findViewById(R.id.benefits);
        acc = (Button) findViewById(R.id.account);


        group.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent i=new Intent(AboutActivity.this,BloodGroup.class);
                                           startActivity(i);
                                       }
                                   }
        );

        guide.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent i=new Intent(AboutActivity.this,Guide.class);
                                         startActivity(i);
                                     }
                                 }
        );

        benefits.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent i=new Intent(AboutActivity.this,Benefits.class);
                                         startActivity(i);
                                     }
                                 }
        );

        acc.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent i=new Intent(AboutActivity.this,MainActivity.class);
                                            startActivity(i);
                                        }
                                    }
        );

    }
}
