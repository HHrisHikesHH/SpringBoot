package com.hrishikesh.ApiHitCounter.model;

public class HitCounter {
    private int count;
    private String name;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public HitCounter(int count, String name) {
        this.count = count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HitCounter\n " + name + " = " + count ;
    }
}
