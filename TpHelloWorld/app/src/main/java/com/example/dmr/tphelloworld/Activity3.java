package com.example.dmr.tphelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();
    TextView txtSayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Intent i = getIntent();
        String theName = i.getStringExtra("NAME");
        txtSayHello = findViewById(R.id.txtSayHello);
        txtSayHello.setText("Bonjour "+ theName);
    }
}
