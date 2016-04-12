package xyz.copypastestd.yamobilization;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qwsa on 12.04.16.
 */
public class ArtistListFragment extends Fragment {

    List<String> listData;

    private SimpleRecyclerAdapter mSimpleRecyclerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artist_list, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        if (mSimpleRecyclerAdapter == null) {
            mSimpleRecyclerAdapter = new SimpleRecyclerAdapter(listData);
            recyclerView.setAdapter(mSimpleRecyclerAdapter);
        } else {
            mSimpleRecyclerAdapter.notifyDataSetChanged();
        }


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist_list, container, false);
        //return view;
    }

    private void initData() {
        listData = new ArrayList<>();
        listData.add("Мурзик");
        listData.add("Барсик");
        listData.add("Васька");
        listData.add("Рыжик");
        listData.add("Мурзик");
        listData.add("Барсик");
        listData.add("Васька");
        listData.add("Рыжик");
        listData.add("Мурзик");
        listData.add("Барсик");
        listData.add("Васька");
        listData.add("Рыжик");

    }
}
