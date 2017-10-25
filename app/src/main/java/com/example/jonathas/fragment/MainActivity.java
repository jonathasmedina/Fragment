package com.example.jonathas.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    FragmentManager fm = getSupportFragmentManager(); //usar o do support

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //só adiciona na primeira vez, se não checar, ao mudar a orientação
        //por exemplo, ele adiciona novamente
        if(savedInstanceState == null){
            Fragment1 frag1 = new Fragment1();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.layoutDireito, frag1, "frag1");
            ft.commit();
        }

        //listView
        String[] lista = new String[] {"Altera texto Fragment 1", "Altera texto Fragment 2", "Altera texto Fragment 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        //vincular listener
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lv, View view, int position, long id) { //alterado
                FragmentTransaction ft = fm.beginTransaction();
                if (position == 0) {
                    Fragment1 frag1 = new Fragment1();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.layoutDireito, frag1, "frag1");
                } else if (position == 1) {
                    Fragment2 frag2 = new Fragment2();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.layoutDireito, frag2, "frag2");
                } else if (position == 2) {
                    Fragment3 frag3 = new Fragment3();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.layoutDireito, frag3, "frag3");
                }
                ft.commit();
            }
        });


    }
}
