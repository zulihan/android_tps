package fr.dmr.tpruntimefragment.tpruntimefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.app.Fragment => attention Android import ça mais il faut importer support.v4......
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

}
