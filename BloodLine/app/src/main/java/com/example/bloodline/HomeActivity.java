package com.example.bloodline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {


    private ImageButton donate, request_blood, about;
    private Button account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        donate = (ImageButton) findViewById(R.id.donate_blood);
        request_blood = (ImageButton) findViewById(R.id.request_blood);
        about = (ImageButton) findViewById(R.id.about);
        account = (Button) findViewById(R.id.account);


        donate.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i=new Intent(HomeActivity.this,DonateBlood.class);
                                          startActivity(i);
                                      }
                                  }
        );

        request_blood.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent i=new Intent(HomeActivity.this,RequestBlood.class);
                                                 startActivity(i);
                                             }
                                         }
        );

        about.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i=new Intent(HomeActivity.this,AboutActivity.class);
                                          startActivity(i);
                                      }
                                  }
        );

        account.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent i=new Intent(HomeActivity.this,MainActivity.class);
                                                 startActivity(i);
                                             }
                                         }
        );

    }
}
