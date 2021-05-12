package it.unimib.letsgreen.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import it.unimib.letsgreen.R;


public class Actions extends Fragment {

    private Button cardPiante;
    private Button cardInquinamento;

    public static Actions newInstance(){
        return new Actions();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_actions, container, false);
    }
}