package ru.startandroid.develop.melkovhw3.data;

import java.util.ArrayList;
import java.util.Collection;

public class User {
    private String name;
    private int age;

    private final Collection<Pressure> pressures;
    private final Collection<LifeValues> lifeValues;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
        this.pressures = new ArrayList<>();
        this.lifeValues = new ArrayList<>();
    }
}
