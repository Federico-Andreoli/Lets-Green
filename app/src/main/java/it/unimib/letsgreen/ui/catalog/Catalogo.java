package it.unimib.letsgreen.ui.catalog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.unimib.letsgreen.R;


public class Catalogo extends Fragment {
    public static Catalogo newInstance() {
        return new Catalogo();
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_catalogo, container, false);
    }
}
