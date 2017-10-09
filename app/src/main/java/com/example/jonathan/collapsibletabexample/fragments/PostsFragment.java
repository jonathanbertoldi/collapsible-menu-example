package com.example.jonathan.collapsibletabexample.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jonathan.collapsibletabexample.R;
import com.example.jonathan.collapsibletabexample.adapter.RecycleAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonat on 08/10/2017.
 */

public class PostsFragment extends Fragment {

    private RecyclerView recyclerView;

    public static PostsFragment newInstance(Context context) {
        PostsFragment fragment = new PostsFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.content_main, null);

        setUpView(root);

        return root;
    }

    private void setUpView(ViewGroup root) {
        recyclerView = (RecyclerView) root.findViewById(R.id.recycler_view);
        setUpList();
    }

    private void setUpList() {
        RecycleAdapter adapter = new RecycleAdapter(createItems());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }

    private List<String> createItems() {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            items.add("Item " + i);
        }
        return items;
    }
}
