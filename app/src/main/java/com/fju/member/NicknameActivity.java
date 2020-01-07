package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText neckname;
    private ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        neckname = findViewById(R.id.nickname);
        findViewById(R.id.next).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Sneckname = neckname.getText().toString();
        SharedPreferences Neckname = getSharedPreferences("nm",MODE_PRIVATE);
        Neckname.edit()
                .putString("NECKNAME",Sneckname)
                .commit();
        Intent intent = new Intent(this,GenderActivity.class);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
