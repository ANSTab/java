package com.tabachenko.task6;

import java.io.Serializable;

public class Auto  implements Serializable {
    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    private String marka;
    private String color;

    public String getMarka(String mazda) {

        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor(String red) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
