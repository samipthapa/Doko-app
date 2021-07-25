package com.example.doko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailClubs extends AppCompatActivity {

    TextView clubName, introduction;
    private RecyclerView tenureRecyclerView;
    private ClubTenureAdapter clubTenureAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_clubs);

        String clubName = new String();
        initView();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            clubName = extras.getString("ClubName", "blank");
            if (!clubName.equals("blank")) {
                Club c = Utility.getInstance(this).getClub(clubName);
                if (null != c) {
                    setData(c);
                }
            }
        }

        clubTenureAdapter = new ClubTenureAdapter(DetailClubs.this);
        tenureRecyclerView = (RecyclerView) findViewById(R.id.tenureRecView);

        tenureRecyclerView.setAdapter(clubTenureAdapter);
        tenureRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        clubTenureAdapter.setTenure(Utility.getInstance(this).getTenure(clubName));
        tenureRecyclerView.setNestedScrollingEnabled(false);
    }

    public void initView() {
        clubName = findViewById(R.id.clubName);
        introduction = findViewById(R.id.introductionText);
    }

    public void setData(Club club) {
        clubName.setText(club.getName());
        introduction.setText(club.getIntroduction());
    }
}