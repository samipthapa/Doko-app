package com.example.doko;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CSIT#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CSIT extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CSIT() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CSIT.
     */
    // TODO: Rename and change types and number of parameters
    public static CSIT newInstance(String param1, String param2) {
        CSIT fragment = new CSIT();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_csit, container, false);
        MaterialCardView csit2023 = view.findViewById(R.id.CSIT2023Card);
        csit2023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2023);
            }
        });

        MaterialCardView csit2022 = view.findViewById(R.id.CSIT2022Card);
        csit2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2022);
            }
        });

        MaterialCardView csit2021 = view.findViewById(R.id.CSIT2021Card);
        csit2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2021);
            }
        });

        MaterialCardView csit2020 = view.findViewById(R.id.CSIT2020Card);
        csit2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2020);
            }
        });

        MaterialCardView csit2019 = view.findViewById(R.id.CSIT2019Card);
        csit2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2019);
            }
        });

        MaterialCardView csit2018 = view.findViewById(R.id.CSIT2018Card);
        csit2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2018);
            }
        });

        MaterialCardView csit2017 = view.findViewById(R.id.CSIT2017Card);
        csit2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2017);
            }
        });

        MaterialCardView csit2016 = view.findViewById(R.id.CSIT2016Card);
        csit2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2016);
            }
        });

        MaterialCardView csit2015 = view.findViewById(R.id.CSIT2015Card);
        csit2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2015);
            }
        });

        MaterialCardView csit2024 = view.findViewById(R.id.CSIT2024Card);
        csit2024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_CSIT_to_CSIT2024);
            }
        });
        return view;
    }
}