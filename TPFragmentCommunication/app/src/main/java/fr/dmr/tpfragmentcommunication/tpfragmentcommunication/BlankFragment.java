package fr.dmr.tpfragmentcommunication.tpfragmentcommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fr.dmr.tpfragmentcommunication.tpfragmentcommunication.dummy.DummyContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    TextView detail;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_blank, container, false);

        String description = getArguments().getString("DESCRIPTION");

        // Inflate the layout for this fragment
        detail = layout.findViewById(R.id.detail);

        if(description != null){
            detail.setText(description);
        }

        return layout;
    }

    public void setTheDetail(DummyContent.DummyItem item){
        detail.setText(item.toString());
    }

}
