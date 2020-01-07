package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText gender;
    private ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        gender = findViewById(R.id.gender);
        String Sgender = gender.getText().toString();
        findViewById(R.id.next).setOnClickListener(this);
        SharedPreferences gender = getSharedPreferences("g",MODE_PRIVATE);
        gender.edit()
                .putString("GENDER",Sgender)
                .commit();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,AgeActivity.class);
        startActivity(intent);
    }
}
