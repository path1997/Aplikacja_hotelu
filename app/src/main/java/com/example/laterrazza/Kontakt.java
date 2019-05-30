package com.example.laterrazza;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Kontakt extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.kontakt, container, false);

        ImageView Mapa = (ImageView) v.findViewById(R.id.mapa);
        Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl ( "https://goo.gl/maps/NjYKU38sVK6do1Hh6");
            }
        });

        return v;
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
