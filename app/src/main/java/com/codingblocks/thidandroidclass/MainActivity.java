package com.codingblocks.thidandroidclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    EditText etValue;
    public static final String TAG = "Main";
    public static final int REQ_CODE  =  123;
    public static final String KEY = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.btnStart);
        etValue = (EditText) findViewById(R.id.etValue);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                int val = Integer.parseInt(etValue.getText().toString());
                i.putExtra(KEY,val);
                startActivityForResult(i,REQ_CODE);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: " );
        if(requestCode == MainActivity.REQ_CODE&& resultCode == 789){
            Log.d(TAG, "onActivityResult: " + data.getStringExtra("second"));
        }
    }

}
