package com.example.jonathas.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jonathas on 22/08/2017.
 */

public class Fragment3 extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag3, null);

        TextView tv = (TextView) view.findViewById(R.id.textView3); //pegar via view
        tv.setText("Fragment 3");

        return view;
    }

    public void alteraTextView(String txt) {

        TextView tv = (TextView) getView().findViewById(R.id.textView); //pegar via view
        tv.setText(txt);
    }
}
