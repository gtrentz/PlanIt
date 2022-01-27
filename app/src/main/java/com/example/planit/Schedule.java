package com.example.planit;
import java.util.ArrayList;
import java.util.Calendar;

public class Schedule {
    private ArrayList<Event> eventlist = new ArrayList<Event>();
    private String name;

    public Schedule(String n) {
    name = n;
    }

    public Schedule() {
        name = "New Schedule";
    }

    public void addEvent(Event e) {
        eventlist.add(e);
    }

    public void removeEvent(int i) {
        eventlist.remove(i);
    }
}
