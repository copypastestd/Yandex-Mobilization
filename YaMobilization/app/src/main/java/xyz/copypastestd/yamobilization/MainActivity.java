package xyz.copypastestd.yamobilization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    private SimpleRecyclerAdapter mSimpleRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the toolbar view inside the activity layout
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            //toolbar.setTitle(R.string.artists);
        }


       /* getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("Коты");*/


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<String> listData = new ArrayList<>();
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

        if (mSimpleRecyclerAdapter == null) {
            mSimpleRecyclerAdapter = new SimpleRecyclerAdapter(listData);
            recyclerView.setAdapter(mSimpleRecyclerAdapter);
        } else {
            mSimpleRecyclerAdapter.notifyDataSetChanged();
        }
    }
}
