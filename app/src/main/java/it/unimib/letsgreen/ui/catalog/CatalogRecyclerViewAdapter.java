package it.unimib.letsgreen.ui.catalog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import it.unimib.letsgreen.R;

public class CatalogRecyclerViewAdapter extends RecyclerView.Adapter<CatalogRecyclerViewAdapter.CatalogViewHolder> {

    private List<String> stringList;

    public CatalogRecyclerViewAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @NotNull
    @Override
    public CatalogViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.catalog_item, parent, false);

        return new CatalogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CatalogViewHolder holder, int position) {
        holder.bind(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class CatalogViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView;
        private ImageView imageView;

        public CatalogViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);
        }

        public void bind(String s) {
            nameTextView.setText(s);
        }
    }
}
