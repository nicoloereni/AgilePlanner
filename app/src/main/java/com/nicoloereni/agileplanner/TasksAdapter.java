package com.nicoloereni.agileplanner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View taskItem;
        public ViewHolder(View taskItem) {
            super(taskItem);
            this.taskItem = taskItem;
        }

    }

    @Override
    public TasksAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        View item = holder.taskItem;

        TextView title = (TextView) item.findViewById(R.id.title);
        title.setText(TasksProvider.getTasks().get(position).title);

        TextView estimate = (TextView) item.findViewById(R.id.estimate);
        estimate.setText(TasksProvider.getTasks().get(position).estimate);

        TextView effort = (TextView) item.findViewById(R.id.effort);
        effort.setText(TasksProvider.getTasks().get(position).effort);

    }

    @Override
    public int getItemCount() {
        return TasksProvider.size();
    }

}
