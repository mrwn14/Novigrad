package com.example.livrable3.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.livrable3.R;
import com.example.livrable3.ServicesDisplay;

public class AdminInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_interface);
    }
    public void SuccButtonOnClick(View view){
        Intent theSucc = new Intent(getApplicationContext(), SuccAdminActivity.class);
        theSucc.putExtra("role","Employé(e)");
        startActivity(theSucc);
    }
    public void ServiceGeneralOnClick(View view){
        Intent theSucc = new Intent(getApplicationContext(), ServicesDisplay.class);
        theSucc.putExtra("role","Employé(e)");
        theSucc.putExtra("case","General");
        theSucc.putExtra("username","NONE");
        startActivity(theSucc);
    }
    public void EmployeeButtonOnClick(View view){
        Intent theSucc = new Intent(getApplicationContext(), EmployeeAdminActivity.class);
        theSucc.putExtra("role","Employé(e)");
        startActivity(theSucc);
    }
    public void ClientButtonOnClick(View view){
        Intent theSucc = new Intent(getApplicationContext(), EmployeeAdminActivity.class);
        theSucc.putExtra("role","Client");
        startActivity(theSucc);
    }
}