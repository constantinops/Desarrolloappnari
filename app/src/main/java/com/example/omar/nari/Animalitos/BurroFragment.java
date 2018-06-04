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
    TextView letras;
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
        letras=(TextView) v.findViewById(R.id.letra);

        burro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burrostarr(v);

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
        mp =MediaPlayer.create(getContext(),R.raw.burros);
        mp.start();
        letras.setText("Guaiu");

        //Toast.makeText(getContext(), "hola ", Toast.LENGTH_LONG).show();

    }

    public void burrostarr(View v){

        mp =MediaPlayer.create(getContext(),R.raw.burro);
        mp.start();
}

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
