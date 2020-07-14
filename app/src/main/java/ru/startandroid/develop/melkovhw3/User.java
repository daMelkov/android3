package ru.startandroid.develop.melkovhw3;

import java.util.Collection;

public class User {
    private String fio;
    private int age;
    private Collection<Pressure> pressures;
    private Collection<LifeValues> lifeValues;

    public User(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }
}
