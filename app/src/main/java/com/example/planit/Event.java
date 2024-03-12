package com.example.planit;
import java.time.*;
import java.util.*;

public class Event {
    private String name;
    Calendar c = Calendar.getInstance();
    public Event(String n, int month, int day, int year, int h, int m) {
        name = n;
        c.setTime(new Date());
        c.add(Calendar.DATE, day - c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.MONTH, month - c.get(Calendar.MONTH));
        c.add(Calendar.YEAR, year - c.get(Calendar.YEAR));
        c.add(Calendar.HOUR, h - c.get(Calendar.HOUR));
        c.add(Calendar.MINUTE, m - c.get(Calendar.MINUTE));
    }

    public Calendar getDate() {
        return c;
    }

    public void setDate(String field, int n) {
        if ("day".equals(field)) {
            c.add(Calendar.DATE, n - c.get(Calendar.DAY_OF_MONTH));
        } else if ("month".equals(field)) {
            c.add(Calendar.MONTH, n - c.get(Calendar.MONTH));
        } else if ("year".equals(field)){
            c.add(Calendar.YEAR, n - c.get(Calendar.YEAR));
        } else if ("hour".equals(field)) {
            c.add(Calendar.HOUR, n - c.get(Calendar.HOUR));
        } else if ("minute".equals(field)) {
            c.add(Calendar.MINUTE, n - c.get(Calendar.MINUTE));
        }
    }

}
