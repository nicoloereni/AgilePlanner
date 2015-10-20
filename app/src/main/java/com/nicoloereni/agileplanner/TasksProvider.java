package com.nicoloereni.agileplanner;


import java.util.ArrayList;
import java.util.List;

//TODO now is a fake
//TODO to impl http://developer.android.com/guide/topics/data/data-storage.html#filesInternal
//TODO made not static
public class TasksProvider {

    public static List<Task> tasks;

    public static List<Task> getTasks() {

        tasks = new ArrayList<>();
        tasks.add(new Task("Titolo 1", "10", "2"));
        tasks.add(new Task("Titolo2", "5", "2"));
        tasks.add(new Task("Titolo 3", "80", "2"));
        tasks.add(new Task("Titolo 4", "13", "2"));
        tasks.add(new Task("Titolo5", "10", "2"));
        tasks.add(new Task("Titolo 6", "5", "2"));
        tasks.add(new Task("Titolo 7", "80", "2"));
        tasks.add(new Task("Titolo 8", "13", "2"));
        tasks.add(new Task("Titolo 9", "10", "2"));
        tasks.add(new Task("Titolo10", "5", "2"));
        tasks.add(new Task("Titolo 11", "80", "2"));
        tasks.add(new Task("Titolo 12", "13", "2"));

        return tasks;
    }


    public static int size() {
        return 12;
    }
}
