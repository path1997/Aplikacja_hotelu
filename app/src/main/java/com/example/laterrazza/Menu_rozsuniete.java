package com.example.laterrazza;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu_rozsuniete extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.menu_rozsuniete, container, false);
        ImageView BMenu = (ImageView) v.findViewById(R.id.BMenu);
        BMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container_a, new Menu());
                fr.commit();
            }
        });

        TextView BoHotelu = (TextView) v.findViewById(R.id.BoHotelu);
        BoHotelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container_a, new Menu());
                fr.replace(R.id.container_b, new O_hotelu());
                fr.commit();
            }
        });

        TextView BPokoje = (TextView) v.findViewById(R.id.BPokoje);
        BPokoje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container_a, new Menu());
                fr.replace(R.id.container_b, new Pokoje());
                fr.commit();
            }
        });

        TextView BRestauracja = (TextView) v.findViewById(R.id.BRestauracja);
        BRestauracja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container_a, new Menu());
                fr.replace(R.id.container_b, new Restauracja());
                fr.commit();
            }
        });

        TextView BGaleria = (TextView) v.findViewById(R.id.BGaleria);
        BGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container_a, new Menu());
                fr.replace(R.id.container_b, new Galeria());
                fr.commit();
            }
        });

        TextView BKontakt = (TextView) v.findViewById(R.id.BKontakt);
        BKontakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container_a, new Menu());
                fr.replace(R.id.container_b, new Kontakt());
                fr.commit();
            }
        });

        return v;
    }
}
