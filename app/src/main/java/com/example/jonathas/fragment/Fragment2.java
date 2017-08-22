package com.example.jonathas.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jonathas on 22/08/2017.
 */

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag2, null);

        TextView tv = (TextView) view.findViewById(R.id.textView); //pegar via view
        tv.setText("Fragment 2");

        return view;
    }
}
