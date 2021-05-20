package it.unimib.letsgreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;


public class Home extends Fragment {

    public static Home newInstance() {

        return new Home();
    }

    private static final String TAG = "MainActivity";
    private MaterialCardView cardPlant;
    private MaterialCardView cardPollution;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_home, container, false);
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