package it.unimib.letsgreen.ui.catalog;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import it.unimib.letsgreen.R;


public class Catalogo extends Fragment {
    public static Catalogo newInstance() {
        return new Catalogo();
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_catalogo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> stringList = new ArrayList<String>();

        for(int i = 0; i < 20; i++) {
            stringList.add("elemento " + i);
        }

        RecyclerView recyclerView = view.findViewById(R.id.catalogo_view);
        CatalogRecyclerViewAdapter catalogRecyclerViewAdapter = new CatalogRecyclerViewAdapter(stringList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(catalogRecyclerViewAdapter);

    }
}
