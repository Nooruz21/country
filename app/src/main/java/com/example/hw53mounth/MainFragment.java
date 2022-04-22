package com.example.hw53mounth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment implements onClick {
    private ArrayList<Model> data;
    private MainAdapter adapter;
    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle);
        adapter = new MainAdapter(data, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model("South Amerika", R.drawable.cna, 1));
        data.add(new Model("Nourth Amerika", R.drawable.csa, 2));
        data.add(new Model("Australia", R.drawable.coc, 3));
        data.add(new Model("Africa", R.drawable.caf,4));
        data.add(new Model("Asia", R.drawable.cas,5));
        data.add(new Model("Europa", R.drawable.cau,6));
    }

    @Override
    public void onClick(Model model) {
        Bundle bundle = new Bundle();
        bundle.putInt(getString(R.string.key), model.getKeyId());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container, fragment).addToBackStack(null).commit();
    }
}