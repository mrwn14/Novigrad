package com.example.livrable3.Employee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.livrable3.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class EmployeeServiceChoice extends AppCompatActivity {
    DatabaseReference reff;
    DatabaseReference reff2;
    ArrayList<String> correctDocs;
    ArrayList<String> correctDocs2;
    ArrayList<String> notCorrectDocs;
    long size;
    Bundle reg;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_service_choice);
        correctDocs = new ArrayList<String>();
        correctDocs2 = new ArrayList<String>();
        notCorrectDocs = new ArrayList<String>();

        reg = getIntent().getExtras();
        username = reg.getString("username");
        ListView choicelistview = (ListView) findViewById(R.id.choiceListView);
        ListView choicelistview2 = (ListView) findViewById(R.id.choiceListView2);
        ArrayAdapter myAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, correctDocs2);
        ArrayAdapter myAdapter2 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, correctDocs);
        choicelistview.setAdapter(myAdapter);
        choicelistview2.setAdapter(myAdapter2);
        reff = FirebaseDatabase.getInstance().getReference().child("GeneralServices");

        reff2 = FirebaseDatabase.getInstance().getReference().child("Services").child(username+"_services");
        reff.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                String val = snapshot.getKey();
                correctDocs.add(val);
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reff2.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                String val = snapshot.getKey();
                if (correctDocs.contains(val)){
                    correctDocs2.add(val);
                    correctDocs.remove(val);
                }
                myAdapter2.notifyDataSetChanged();
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                myAdapter2.notifyDataSetChanged();
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        choicelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String test = correctDocs.get(position);
//                correctDocs.add(correctDocs2.get(position));
//                correctDocs2.remove(correctDocs.get(position));
                if(correctDocs2.size()>3) {
                    correctDocs.add(correctDocs2.get(position));
                    correctDocs2.remove(position);
                    myAdapter.notifyDataSetChanged();
                    myAdapter2.notifyDataSetChanged();
                }

//                for(int i = 0; i < correctDocs.size(); i++){
//                    try{
//                        Log.d("hamid","CorrectDocs" + correctDocs.get(position));
//                    }
//                    catch (Exception e){
//                        Log.d("hamid", "max length is "+i);
//                    }
//                }
//                for(int i = 0; i < correctDocs2.size(); i++){
//                    try{
//                        Log.d("hamid","CorrectDocs2 " + correctDocs2.get(position));
//                    }
//                    catch (Exception e){
//                        Log.d("hamid", "max length is "+i);
//                    }
//                }
            }
        });
        choicelistview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    correctDocs2.add(correctDocs.get(position));
                    correctDocs.remove(position);
                    myAdapter.notifyDataSetChanged();
                    myAdapter2.notifyDataSetChanged();

            }
        });
    }

    public void add(View view) {
        reff = FirebaseDatabase.getInstance().getReference().child("GeneralServices");
        reff2 = FirebaseDatabase.getInstance().getReference().child("Services").child(username+"_services");
        HashMap hh = new HashMap();
        reff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    if (correctDocs2.contains(ds.getKey())) {
                        hh.put(ds.getKey(), ds.getValue());
                    }
                }
                reff2.setValue(hh);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

    }
}