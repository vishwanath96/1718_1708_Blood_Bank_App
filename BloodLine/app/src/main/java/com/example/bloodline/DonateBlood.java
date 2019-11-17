package com.example.bloodline;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DonateBlood extends AppCompatActivity {

    DatabaseReference databaseReference;
    EditText editText_name;
    Button save_button;
    Spinner spinnerBloodGroup;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_layout);
        mAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("donors");

        editText_name = (EditText) findViewById(R.id.editText2);
        save_button = (Button) findViewById(R.id.button2);
        spinnerBloodGroup = (Spinner) findViewById(R.id.spinner);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           saveInfo();
            }
        });

    }

    public void saveInfo() {
        String name1 = editText_name.getText().toString().trim();
        String bloodGroup = spinnerBloodGroup.getSelectedItem().toString();
        FirebaseUser user =  mAuth.getCurrentUser();
        String userId = user.getUid();
        String email = user.getEmail();

        if(!TextUtils.isEmpty(name1)){
            String id = databaseReference.push().getKey();
            UserInformation userInformation = new UserInformation(id, name1, bloodGroup);
            databaseReference.child(id).setValue(userInformation);
            Toast.makeText(this,"Donor added successfully",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Please Enter your name",Toast.LENGTH_LONG).show();
        }

        //Intent i = new Intent(DonateBlood.this, MainActivity.class);
        //startActivity(i);
    }
}



