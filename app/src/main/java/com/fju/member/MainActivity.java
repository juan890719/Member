package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText neckname;
    private EditText gender;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        neckname = findViewById(R.id.nm);
        String SN = neckname.getText().toString();
        gender = findViewById(R.id.g);
        String SG = gender.getText().toString();
        age = findViewById(R.id.a);
        String SA = age.getText().toString();
        String Sneckname = getSharedPreferences("nm",MODE_PRIVATE)
                .getString("NECKNAME"," ");
        neckname.setText(Sneckname);
        if (TextUtils.isEmpty(SN)){
            Intent intent1 = new Intent(this,NicknameActivity.class);
            startActivity(intent1);
        }
    }
}
