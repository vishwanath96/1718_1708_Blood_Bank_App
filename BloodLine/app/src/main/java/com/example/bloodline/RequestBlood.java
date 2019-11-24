package com.example.bloodline;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RequestBlood extends AppCompatActivity {

    DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
    private Button acc;

    ListView listViewDonors;
    List<UserInformation> userInformationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_layout);
        mAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Donors");

        listViewDonors = (ListView) findViewById(R.id.listViewDonors);

        acc = (Button) findViewById(R.id.account);
        acc.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent i=new Intent(RequestBlood.this,MainActivity.class);
                                       startActivity(i);
                                   }
                               }
        );
        /*listViewDonors.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(), "An item of the ListView is clicked.", Toast.LENGTH_LONG).show();
                //String contact=userInformationList.get(position).contact;
                //Log.d("contact","$contact");
            }
        });
         */
        userInformationList = new ArrayList<>();

    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                userInformationList.clear();
                for (DataSnapshot donorSnapshot: dataSnapshot.getChildren()){
                    UserInformation userInformation = donorSnapshot.getValue(UserInformation.class);
                    userInformationList.add(userInformation);
                }
                DonorList adapter = new DonorList(RequestBlood.this,userInformationList);
                listViewDonors.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}