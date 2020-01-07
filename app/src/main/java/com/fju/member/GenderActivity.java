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
        findViewById(R.id.next).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Sgender = gender.getText().toString();
        SharedPreferences Gender = getSharedPreferences("g",MODE_PRIVATE);
        Gender.edit()
                .putString("GENDER",Sgender)
                .commit();
        Intent intent = new Intent(this,AgeActivity.class);
        startActivity(intent);
    }
}
