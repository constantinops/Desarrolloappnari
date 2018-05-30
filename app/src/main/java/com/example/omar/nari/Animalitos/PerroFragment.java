package com.example.omar.nari.Animalitos;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.omar.nari.R;


public class PerroFragment extends Fragment {

    ImageView clic,perro;
    MediaPlayer mp;




    public PerroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_perro, container, false);
        clic=(ImageView)v.findViewById(R.id.btnperros);
        perro=(ImageView)v.findViewById(R.id.imagperro);

        perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vacastar(v);
                //mp.stop();

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
        mp =MediaPlayer.create(getContext(),R.raw.perros);
        mp.start();

        //Toast.makeText(getContext(), "hola ", Toast.LENGTH_LONG).show();

    }

    public void vacastar(View v){
        //Toast.makeText(getContext(),"hola abi",Toast.LENGTH_LONG).show();

        mp =MediaPlayer.create(getContext(),R.raw.perro);
        mp.start();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
