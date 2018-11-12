package com.example.user1.apprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List places = new ArrayList();
        places.add(new Place(R.drawable.uk,"UK","Lorem ipsum"));
        places.add(new Place(R.drawable.brazil,"BRAZIL","Lorem ipsum"));
        places.add(new Place(R.drawable.france,"FRANCE","Lorem ipsum"));
        places.add(new Place(R.drawable.peru,"PERU","Lorem ipsum"));
        places.add(new Place(R.drawable.usa,"USA","Lorem ipsum"));

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerPlace);
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new PlaceAdapter(places);
        mRecyclerView.setAdapter(mAdapter);
    }
}
