package fr.dmr.tptoastsnack.tptoastsnack;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToast(View view){
        Toast.makeText(this,"Un Toast", Toast.LENGTH_LONG).show();
    }

    public void clickSnack(View view){
        Snackbar.make(view, "Snack !", Snackbar.LENGTH_SHORT).show();
    }
}
