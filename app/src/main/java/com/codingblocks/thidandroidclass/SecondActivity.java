package com.codingblocks.thidandroidclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String data = getIntent().getStringExtra(MainActivity.KEY);
        textView = (TextView) findViewById(R.id.tvParamter);
        textView.setText(data);
        data = data + " Rishabh Khanna";
        Intent i = new Intent();
        i.putExtra("second",data);

        Intent j = new Intent();
        setResult(789,i);
        setResult(567,j);

    }
}
