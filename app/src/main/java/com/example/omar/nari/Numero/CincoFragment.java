package com.example.omar.nari.Numero;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.omar.nari.R;


public class CincoFragment extends Fragment {

    ImageView clic;
    MediaPlayer mp;
    public CincoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_cinco, container, false);
        clic=(ImageView)v.findViewById(R.id.btncinco);
        clic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido(v);

            }
        });
        return v;
    }


    public void sonido(View v) {

        mp =MediaPlayer.create(getContext(),R.raw.cinco);
        mp.start();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
