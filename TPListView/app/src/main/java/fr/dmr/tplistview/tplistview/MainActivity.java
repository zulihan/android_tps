package fr.dmr.tplistview.tplistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] pizzas = getResources().getStringArray(R.array.pizzas);
        listView = findViewById(R.id.listItem);

        // La méthode setAdapter attends en paramètre un objet qui implémente l'interface ListAdapter

        ArrayAdapter<String> pizzaAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pizzas);

        listView.setAdapter(pizzaAdapter);

        listView.setOnItemClickListener(this);
        }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String p = "Pizza "+ adapterView.getAdapter().getItem(i);

        Toast.makeText(this, p, Toast.LENGTH_SHORT).show();
    };

}
