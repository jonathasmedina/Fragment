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

public class Fragment1 extends android.support.v4.app.Fragment { //importar da support!
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag1, null);

        TextView tv = (TextView) view.findViewById(R.id.textView); //pegar via view
        tv.setText("Fragment 1");

        return view;
    }

    public void alteraTextView(String txt) {

        TextView tv = (TextView) getView().findViewById(R.id.textView); //pegar via view
        tv.setText(txt);
    }

}
