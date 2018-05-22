package com.example.omar.nari.Animalitos;

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



public class BorregoFragment extends Fragment {


    ImageView clic,borregos;
    MediaPlayer mp;

    public BorregoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_borrego, container, false);
        clic=(ImageView)v.findViewById(R.id.btnborregos);
        borregos=(ImageView)v.findViewById(R.id.imageborrego);

        borregos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borregostar(v);

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

    public void borregostar(View v){
        //Toast.makeText(getContext(),"hola abi",Toast.LENGTH_LONG).show();
        mp =MediaPlayer.create(getContext(),R.raw.borregoss);
        mp.start();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
