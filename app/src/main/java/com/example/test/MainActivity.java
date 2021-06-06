package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;

public class MainActivity extends AppCompatActivity {
    private Button change_page_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_Username = findViewById(R.id.edit_Username);
        final EditText edit_Password = findViewById(R.id.edit_Password);
        change_page_btn = findViewById(R.id.Data_base);
        change_page_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Change_activity_userlist();
            }
        });
        Button btn = findViewById(R.id.submit_btn);
        DAOEmployee dao =new DAOEmployee();
        btn.setOnClickListener(v ->
        {
            Employee emp = new Employee(edit_Username.getText().toString(),edit_Password.getText().toString());
            dao.add(emp).addOnSuccessListener(suc ->
            {
                Toast.makeText(this, "Record data", Toast.LENGTH_SHORT).show();
            });



        });

    }
    public void Change_activity_userlist()
    {
        Intent intent = new Intent(MainActivity.this,MainActivity_userlist.class);
        startActivity(intent);
        finish();
    }
}