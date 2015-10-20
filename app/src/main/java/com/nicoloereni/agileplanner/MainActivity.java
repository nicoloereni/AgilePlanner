package com.nicoloereni.agileplanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.melnykov.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView tasksRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasksRecyclerView = (RecyclerView) findViewById(R.id.tasks_recycler_view);

        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksRecyclerView.setAdapter(new TasksAdapter());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToRecyclerView(tasksRecyclerView);

        getSupportActionBar().hide();

    }
}
