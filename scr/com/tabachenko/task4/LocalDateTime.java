package com.tabachenko.task4;

public class LocalDateTime {
    private int date;
    private int mounth;
    private int year;

    @Override
    public String toString() {
        return "{" +
                "date=" + date +
                ", mounth=" + mounth +
                ", year=" + year +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDateTime(int date, int mounth, int year) {
        this.date = date;
        this.mounth = mounth;
        this.year = year;
    }




}
