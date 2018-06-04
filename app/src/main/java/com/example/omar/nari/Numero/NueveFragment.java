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
import android.widget.TextView;

import com.example.omar.nari.R;


public class NueveFragment extends Fragment {
    TextView letras;
    ImageView clic;
    MediaPlayer mp;

    public NueveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_nueve, container, false);
        clic=(ImageView)v.findViewById(R.id.btnnueve);
        letras=(TextView) v.findViewById(R.id.letra);
        clic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido(v);

            }
        });
        return v;
    }


    public void sonido(View v) {

        mp =MediaPlayer.create(getContext(),R.raw.nueve);
        mp.start();
        letras.setText("Hìn");

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
