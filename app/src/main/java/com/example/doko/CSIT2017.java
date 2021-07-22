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
 * Use the {@link CSIT2017#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CSIT2017 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CSIT2017() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CSIT2017.
     */
    // TODO: Rename and change types and number of parameters
    public static CSIT2017 newInstance(String param1, String param2) {
        CSIT2017 fragment = new CSIT2017();
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
        View view = inflater.inflate(R.layout.fragment_csit2017, container, false);
        Context context = getActivity().getApplicationContext();
        RecyclerView studentRecView = view.findViewById(R.id.CSIT2017RecView);
        StudentRecyclerViewAdapter studentRecyclerViewAdapter = new StudentRecyclerViewAdapter(context);

        studentRecView.setAdapter(studentRecyclerViewAdapter);
        studentRecView.setLayoutManager(new GridLayoutManager(context, 2));

        studentRecyclerViewAdapter.setStudents(Utility.getInstance(context).getBatch(86, 131));
        return view;
    }
}