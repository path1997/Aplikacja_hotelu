package com.example.laterrazza;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   /* private Menu menu;
    private O_hotelu o_hotelu;
    private Pokoje pokoje;
    public Menu_rozsuniete menu_rozsuniete;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*menu = new Menu();
        o_hotelu=new O_hotelu();
        pokoje=new Pokoje();
        menu_rozsuniete=new Menu_rozsuniete();*/

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_a,new Menu()).replace(R.id.container_b,new O_hotelu());
        fragmentTransaction.commit();
        /*getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, menu)
                .replace(R.id.container_b,o_hotelu)
                .commit();*/

    }

}
