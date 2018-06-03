package com.example.omar.nari.Animalitos;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.omar.nari.R;

import static android.media.MediaPlayer.*;

public class CaballoFragment extends Fragment {


   ImageView clic,caba;
   TextView letras;
    private MediaPlayer mp;

    public CaballoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View v=inflater.inflate(R.layout.fragment_caballo, container, false);


        //mp = MediaPlayer.create(this,R.raw.burroos);
        clic=(ImageView)v.findViewById(R.id.caballoss);
        caba=(ImageView)v.findViewById(R.id.imgcaballo);
        letras=(TextView) v.findViewById(R.id.letra);
       // mp=MediaPlayer.create(this,R.raw.caballo);
        //mp=MediaPlayer.create(this,R.raw.burroos);
        letras=(TextView) v.findViewById(R.id.letra);

        caba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caballostar(v);

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


    public void sonido(View v){

        mp =MediaPlayer.create(getContext(),R.raw.caballos);
        mp.start();
        letras.setText("Guaiu");

       //Toast.makeText(getContext(),"hola",Toast.LENGTH_LONG).show();

    }

    public void caballostar(View v){
        //Toast.makeText(getContext(),"hola abi",Toast.LENGTH_LONG).show();
        mp =MediaPlayer.create(getContext(),R.raw.caballo);
        mp.start();
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
