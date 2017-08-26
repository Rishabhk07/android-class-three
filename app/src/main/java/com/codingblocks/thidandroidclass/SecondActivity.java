package com.codingblocks.thidandroidclass;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    public static final String TAG = "SecondActivity";
    Button btnAdd;
    String key = "key";
    int a;
    int data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        data = getIntent().getIntExtra(MainActivity.KEY,0);
        textView = (TextView) findViewById(R.id.tvParamter);
        btnAdd = (Button) findViewById(R.id.btnAdd);

//        data = data + " Rishabh Khanna";
//        Intent i = new Intent();
//        i.putExtra("second",data);
//        Intent j = new Intent();
//        setResult(789,i);
//        setResult(567,j);
        if(savedInstanceState != null){
        data  = savedInstanceState.getInt(key);
            Log.d(TAG, "onCreate: " + data);
        }
        textView.setText(String.valueOf(data));
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = Integer.parseInt(textView.getText().toString());
                textView.setText(String.valueOf(++data));
            }
        });

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(key,data);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
