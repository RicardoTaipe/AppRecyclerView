package com.example.user1.apprecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>{
    private List<Place> items;

    public PlaceAdapter(List<Place> items) {
        this.items = items;
    }

    public class PlaceViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagePlace;
        public TextView namePlace, descriptionPlace;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            imagePlace = (ImageView) itemView.findViewById(R.id.image);
            namePlace = (TextView) itemView.findViewById(R.id.name);
            descriptionPlace = (TextView) itemView.findViewById(R.id.description);
        }
    }
    @NonNull
    @Override
    public PlaceAdapter.PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_item_card,parent,false);
        return new PlaceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.PlaceViewHolder holder, int position) {
        holder.imagePlace.setImageResource(items.get(position).getImage());
        holder.namePlace.setText(items.get(position).getName());
        holder.descriptionPlace.setText(items.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
