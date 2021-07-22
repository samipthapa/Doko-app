package com.example.doko;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CSIT2019#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CSIT2019 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CSIT2019() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CSIT2019.
     */
    // TODO: Rename and change types and number of parameters
    public static CSIT2019 newInstance(String param1, String param2) {
        CSIT2019 fragment = new CSIT2019();
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
        View view = inflater.inflate(R.layout.fragment_csit2019, container, false);
        Context context = getActivity().getApplicationContext();
        RecyclerView studentRecView = view.findViewById(R.id.CSIT2019RecView);
        StudentRecyclerViewAdapter studentRecyclerViewAdapter = new StudentRecyclerViewAdapter(context);

        studentRecView.setAdapter(studentRecyclerViewAdapter);
        studentRecView.setLayoutManager(new GridLayoutManager(context, 2));

        studentRecyclerViewAdapter.setStudents(Utility.getInstance(context).getBatch(180, 226));
        return view;
    }
}