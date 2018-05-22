package com.example.omar.nari.Animalitos;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.omar.nari.R;


public class BurroFragment extends Fragment {

    ImageView clic,burro;
    MediaPlayer mp;
    public BurroFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_burro, container, false);
        clic=(ImageView)v.findViewById(R.id.btnburro);
        burro=(ImageView)v.findViewById(R.id.imgburro);

        burro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burrostar(v);

            }
        });

        clic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido(v);

            }
        });

        return v;
    }



    public void sonido(View v) {

        Toast.makeText(getContext(), "hola ", Toast.LENGTH_LONG).show();

    }

    public void burrostar(View v){

        mp =MediaPlayer.create(getContext(),R.raw.burro);
        mp.start();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
