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

import java.util.ArrayList;


public class ClubTenureAdapter extends RecyclerView.Adapter<ClubTenureAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ClubTenure> clubTenures = new ArrayList<>();

    public ClubTenureAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.club_tenure, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubTenureAdapter.ViewHolder holder, int position) {
        holder.clubTitle.setText(clubTenures.get(position).getClubName());
        holder.date.setText(clubTenures.get(position).getTenure());
        Glide.with(context)
                .asBitmap()
                .load(clubTenures.get(position).getImageUrl())
                .into(holder.clubPicture);
        holder.clubMission.setText(clubTenures.get(position).getMission());
        holder.clubVision.setText(clubTenures.get(position).getVision());
        holder.mentor.setText(clubTenures.get(position).getMentor());
        holder.president.setText(clubTenures.get(position).getPresident());
        holder.vicePresident.setText(clubTenures.get(position).getVicePresident());
        holder.members.setText(clubTenures.get(position).getMembers());
    }

    @Override
    public int getItemCount() {
        return clubTenures.size();
    }

    public void setTenure(ArrayList<ClubTenure> clubTenures) {
        this.clubTenures = clubTenures;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView clubTitle;
        private TextView date;
        private TextView clubMission;
        private TextView clubVision;
        private TextView mentor;
        private TextView president;
        private TextView vicePresident;
        private TextView members;
        private ImageView clubPicture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            clubTitle = itemView.findViewById(R.id.clubNameTenure);
            date = itemView.findViewById(R.id.tenureTime);
            clubMission = itemView.findViewById(R.id.clubMissionText);
            clubVision = itemView.findViewById(R.id.clubVisionText);
            mentor = itemView.findViewById(R.id.mentorText);
            president = itemView.findViewById(R.id.presidentText);
            vicePresident = itemView.findViewById(R.id.vicePresidentText);
            members = itemView.findViewById(R.id.membersText);
            clubPicture = itemView.findViewById(R.id.clubImage);
        }
    }
}
