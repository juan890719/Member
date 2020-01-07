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
    private ImageView done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        age = findViewById(R.id.age);
        findViewById(R.id.done).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Sage = age.getText().toString();
        SharedPreferences Age = getSharedPreferences("a",MODE_PRIVATE);
        Age.edit()
                .putString("AGE",Sage)
                .commit();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
