package com.example.bloodline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BloodGroup extends AppCompatActivity {

    private Button acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bloodgroup);

        acc = (Button) findViewById(R.id.account);
        acc.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent i=new Intent(BloodGroup.this,MainActivity.class);
                                       startActivity(i);
                                   }
                               }
        );


    }
}
