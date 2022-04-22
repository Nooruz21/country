package com.example.hw53mounth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onClick{
    private ArrayList<Model> data;
    private MainAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle_second);
        adapter = new MainAdapter(data, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt(getString(R.string.key));
        switch (val) {
            case 1:
                data.add(new Model("Сanada", R.drawable.ca));
                data.add(new Model("Cuba", R.drawable.cu));
                data.add(new Model("Bagamy", R.drawable.bs));
                data.add(new Model("Mexico", R.drawable.mx));
                data.add(new Model("USA", R.drawable.us));
                break;

            case 2:
                data.add(new Model("Brazil", R.drawable.br));
                data.add(new Model("Argentina", R.drawable.ar));
                data.add(new Model("Uruguay", R.drawable.uy));
                data.add(new Model("Peru", R.drawable.pe ));
                data.add(new Model("Bolivia", R.drawable.bo));
                break;

            case 3:
                data.add(new Model("Australia", R.drawable.au));
                break;

            case 4:
                data.add(new Model("Egypt", R.drawable.eg));
                data.add(new Model("Sudan", R.drawable.sd));
                data.add(new Model("Kenya", R.drawable.ke));
                data.add(new Model("Nigerya", R.drawable.ng));
                data.add(new Model("Angelo", R.drawable.ao));
                break;

            case 5:
                data.add(new Model("Kyrgyzstan", R.drawable.kg));
                data.add(new Model("Kazahstan", R.drawable.kz));
                data.add(new Model("Tajikstan", R.drawable.tj));
                data.add(new Model("Russia", R.drawable.ru));
                data.add(new Model("Japan", R.drawable.jp));
                break;

            case 6:
                data.add(new Model("Turkey", R.drawable.tr));
                data.add(new Model("Ukraina", R.drawable.ua));
                data.add(new Model("France", R.drawable.fr));
                data.add(new Model("Horwatya", R.drawable.hr));
                data.add(new Model("Russya", R.drawable.ru));
                break;

        }

    }

    @Override
    public void onClick(Model model) {

    }
}