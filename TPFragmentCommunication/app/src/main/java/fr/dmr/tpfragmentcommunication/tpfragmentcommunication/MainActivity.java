package fr.dmr.tpfragmentcommunication.tpfragmentcommunication;

import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import fr.dmr.tpfragmentcommunication.tpfragmentcommunication.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements PizzaListFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment detailFragment;
        detailFragment =(BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
        if(detailFragment ==null) {
            PizzaListFragment pizzaListFragment = new PizzaListFragment();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.fragment_container, pizzaListFragment);
            transaction.commit();
        }
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item){
        BlankFragment detailFragment;

        detailFragment =(BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
        if(detailFragment !=null){
            detailFragment.setTheDetail(item);
        }
        else{
            detailFragment = new BlankFragment();

            Bundle data = new Bundle();
            data.putCharSequence("DESCRIPTION",item.toString());
            detailFragment.setArguments(data);


            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, detailFragment);

            transaction.addToBackStack(null);

            //comit the transaction
            transaction.commit();
        }
    }
}
