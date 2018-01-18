package com.example.dmr.tphelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
                                                    // Interface pour la troisième façon de faire
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button openActivity;
        openActivity = findViewById(R.id.openActivity1);
        openActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        Button openActivity3 = findViewById(R.id.openActivity3);
        Button openActivity4 = findViewById(R.id.openActivity4);
        openActivity3.setOnClickListener(this);
        openActivity4.setOnClickListener(this);

    }

    // Deuxième façon de faire en ajoutant un onclick dans le xml / cf button1
    public void goToActivity2(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    // Troisième façon de faire
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.openActivity3:
                doClickButton3();
                break;
            case R.id.openActivity4:
                doClickButton4();
                break;
        }
    }

    private void doClickButton3(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    private void doClickButton4(){
        Intent intent = new Intent(this, Main2Activity.class);
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
