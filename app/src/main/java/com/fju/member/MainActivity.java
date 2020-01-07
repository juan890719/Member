package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.GZIPInputStream;

public class MainActivity extends AppCompatActivity {

    private EditText neckname;
    private EditText gender;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        neckname = findViewById(R.id.nm);
        gender = findViewById(R.id.g);
        age = findViewById(R.id.a);
        String Neckname = getSharedPreferences("nm",MODE_PRIVATE)
                .getString("NECKNAME","");
        neckname.setText(Neckname);
        String Gender = getSharedPreferences("g",MODE_PRIVATE)
                .getString("GENDER","");
        gender.setText(Gender);
        String Age = getSharedPreferences("a",MODE_PRIVATE)
                .getString("AGE","");
        age.setText(Age);
        String SN = neckname.getText().toString();
        String SG = gender.getText().toString();
        String SA = age.getText().toString();
        if (TextUtils.isEmpty(SN)){
            Intent intent1 = new Intent(this,NicknameActivity.class);
            startActivity(intent1);
            Toast.makeText(MainActivity.this,"請輸入匿名",Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(SG)){
            Intent intent2 = new Intent(this,GenderActivity.class);
            startActivity(intent2);
            Toast.makeText(MainActivity.this,"請輸入性別",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(SA)){
            Intent intent3 = new Intent(this,AgeActivity.class);
            startActivity(intent3);
            Toast.makeText(MainActivity.this,"請輸入年齡",Toast.LENGTH_LONG).show();
        }
    }
}
