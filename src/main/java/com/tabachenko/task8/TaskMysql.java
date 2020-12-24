package com.tabachenko.task8;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;

public class TaskMysql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        SqlTask sqlTask = new SqlTask();
        //System.out.println(sqlTask.SqlGetListObj());
        //sqlTask.DatabaseWithoutMysql();
        ArrayList<CountryInfo> arrayList = sqlTask.SqlGetListObj();
        for (CountryInfo co : arrayList) {
            System.out.println("Країни: " + co.getCountryName() + "," + " Кількість регіонів:  " + co.getRegionCount() + "," + " Кількість міст:  " + co.getCityCount());
        }
    }
}