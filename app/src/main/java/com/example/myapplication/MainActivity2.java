package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int count2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv2 = findViewById(R.id.textView);
        Button   bt3 = findViewById(R.id.button3);
        Intent it = getIntent();
        count2 = it.getIntExtra("点击次数",0);
        tv2.setText("你点击了按钮"+count2+"次");
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}