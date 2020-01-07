package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AgeActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText age;
    private ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        age = findViewById(R.id.age);
        String Sage = age.getText().toString();
        findViewById(R.id.next).setOnClickListener(this);
        SharedPreferences age = getSharedPreferences("a",MODE_PRIVATE);
        age.edit()
                .putString("AGE",Sage)
                .commit();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
