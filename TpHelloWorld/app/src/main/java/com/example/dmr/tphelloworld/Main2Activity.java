package com.example.dmr.tphelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = this.getClass().getSimpleName();
    private Button btnSend;
    private EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "onCreate");
        btnSend = findViewById(R.id.btnSend);
        txtName = findViewById(R.id.editText);

        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intent = new Intent(this, Activity3.class);
        String theNameValue = txtName.getText().toString();
        intent.putExtra("NAME", theNameValue);
        startActivity(intent);
        Log.i(TAG, theNameValue);
    }

    public void goToActivity3(View v){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.wtf(TAG, "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.wtf(TAG, "onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.wtf(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

}
