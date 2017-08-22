package com.example.jonathas.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {

    FragmentManager fm = getSupportFragmentManager(); //usar o do support

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listView
        String[] lista = new String[] {"Altera texto Fragment 1", "Altera texto Fragment 2", "Altera texto Fragment 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        //vincular listener
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lv, View view, int position, long id) { //alterado
                if (position==0){//alterar texto com o manager do fragment (começa em 0, essa é a segunda posição)
                    // Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.fragment1);
                    Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.fragment1);
                    frag1.alteraTextView("Fragment 1 - TextView alterado");

                }
                if (position==1){//alterar texto com o manager do fragment (começa em 0, essa é a segunda posição)
                    // Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.fragment1);
                    Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.fragment1);
                    frag1.alteraTextView("Fragment 2 - TextView alterado");

                }
                if (position==2){//alterar texto com o manager do fragment (começa em 0, essa é a segunda posição)
                    // Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.fragment1);
                    Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.fragment1);
                    frag1.alteraTextView("Fragment 3 - TextView alterado");

                }

            }
        });


    }
}
