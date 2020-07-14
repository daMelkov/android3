package ru.startandroid.develop.melkovhw3.data;

public class Pressure {
    private int systolic;
    private int diastolic;
    private int pulse;
    private boolean tachycardia;
    private String date;

    public Pressure(int systolic, int diastolic, int pulse, boolean tachycardia, String date) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.date = date;
    }
}
