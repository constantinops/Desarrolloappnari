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
import android.widget.TextView;
import android.widget.Toast;

import com.example.omar.nari.R;

public class GallinaFragment extends Fragment {
    ImageView clic,gallina;
    MediaPlayer mp;
    TextView letras;
    public GallinaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_gallina, container, false);
        clic=(ImageView)v.findViewById(R.id.btngallinas);
        gallina=(ImageView)v.findViewById(R.id.imaggallina);
        letras=(TextView) v.findViewById(R.id.letra);

        gallina.setOnClickListener(new View.OnClickListener() {
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
        mp =MediaPlayer.create(getContext(),R.raw.gallinas);
        mp.start();
        letras.setText("Yuchée ");



        //Toast.makeText(getContext(), "hola ", Toast.LENGTH_LONG).show();

    }

    public void vacastar(View v){
        //Toast.makeText(getContext(),"hola abi",Toast.LENGTH_LONG).show();

        mp =MediaPlayer.create(getContext(),R.raw.gallina);
        mp.start();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
