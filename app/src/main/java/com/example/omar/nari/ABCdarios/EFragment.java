package com.example.omar.nari.ABCdarios;

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



public class EFragment extends Fragment {
    TextView letras;
    ImageView clic;
    MediaPlayer mp;

    public EFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_e, container, false);
        clic=(ImageView)v.findViewById(R.id.ee);
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

        mp =MediaPlayer.create(getContext(),R.raw.borrego);
        mp.start();
        letras.setText("Aa");
        //Toast.makeText(getContext(), "hola ", Toast.LENGTH_LONG).show();

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
