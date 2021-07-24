package com.example.doko;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class ClubRecylerViewAdapter extends  RecyclerView.Adapter<ClubRecylerViewAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Club> clubs = new ArrayList<>();

    public ClubRecylerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_student, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubRecylerViewAdapter.ViewHolder holder, int position) {
        holder.clubName.setText(clubs.get(position).getName());
        Glide.with(context)
                .asBitmap()
                .load(clubs.get(position).getImageUrl())
                .into(holder.clubImage);
    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }

    public void setClubs(ArrayList<Club> clubs) {
        this.clubs = clubs;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private MaterialCardView parent;
        private TextView clubName;
        private ImageView clubImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.studentCardParent);
            clubImage = itemView.findViewById(R.id.imageStudent);
            clubName = itemView.findViewById(R.id.studentName);
        }
    }
}
