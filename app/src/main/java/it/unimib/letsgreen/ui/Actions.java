package it.unimib.letsgreen.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

import it.unimib.letsgreen.R;


public class Actions extends Fragment {

    private static final String TAG = "MainActivity";
    private MaterialCardView cardPlant;
    private MaterialCardView cardPollution;

    public static Actions newInstance(){

        return new Actions();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_actions, container, false);
       cardPlant = view.findViewById(R.id.cardViewPlant);
        cardPollution = view.findViewById(R.id.cardViewPollution);


        cardPlant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "funziona tutto, ora puoi piangere");
            }
        });

        cardPollution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "funziona tutto, ora puoi piangere 2");
            }
        });

        return view;
    }


    
}