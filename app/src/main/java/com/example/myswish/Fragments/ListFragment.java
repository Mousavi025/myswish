package com.example.myswish.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myswish.R;
import com.example.myswish.Adaptor.MyAdapter;
import com.example.myswish.Models.MyItem;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    ArrayList<MyItem> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recycler = view.findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        list.add(new MyItem("افرافکت", R.drawable.ae));
        list.add(new MyItem("پریمیر", R.drawable.pa));
        list.add(new MyItem("ایلوستریتور", R.drawable.aa));

        recycler.setAdapter(new MyAdapter(list));

        return view;
    }
}
