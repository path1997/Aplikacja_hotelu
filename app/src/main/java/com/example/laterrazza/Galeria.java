package com.example.laterrazza;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Galeria extends Fragment implements View.OnClickListener {
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.galeria, container, false);

        LinearLayout linearLayout= (LinearLayout) v.findViewById(R.id.linearLayout);
        imageView= (ImageView) v.findViewById(R.id.imageView);
        for(int i=0;i<15;i++){
            ImageView localView= new ImageView(v.getContext());
            localView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
            localView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int resID=getResources().getIdentifier("r"+i,"drawable","com.example.laterrazza");
            localView.setImageResource(resID);
            localView.setOnClickListener(this);
            linearLayout.addView(localView);
            if (savedInstanceState != null) {
                Bitmap bitmap = savedInstanceState.getParcelable("obrazek");
                imageView.setImageBitmap(bitmap);
            }
            imageView.setImageDrawable(localView.getDrawable());
        }
        return v;

    }

    @Override
    public void onClick(View v) {
        ImageView localView = (ImageView) v;
        imageView.setImageDrawable(localView.getDrawable());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
        if ( bitmapDrawable!=null)
        {
            outState.putParcelable("obrazek",bitmapDrawable.getBitmap());
        }
    }
}
