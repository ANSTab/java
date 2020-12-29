package com.tabachenko.task8;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;

public class LauncherSqlBase {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int idCountru = 17101988;
        String coutnryName = "ANSTAB";
        int idRegion = 22111999;
        String regionName = "ANSTAB region.";
        String cityName = "Sofiy";

        SqlTask sqlTask = new SqlTask();
        sqlTask.DatabaseWithoutMysql();
        //sqlTask.DatabaseUpd(idCountru, coutnryName, idRegion, regionName, cityName);
        //System.out.println(sqlTask.SqlGetListObj());


        /*ArrayList<CountryInfo> arrayList = sqlTask.SqlGetListObj();
        for (CountryInfo co : arrayList) {
            System.out.println("Країни: " + co.getCountryName() + "," + " Кількість регіонів:  " + co.getRegionCount() + "," + " Кількість міст:  " + co.getCityCount());
        }*/
        //sqlTask.allBase();
    }
}