package com.tabachenko.task8;

import java.sql.*;
import java.util.ArrayList;

public class SqlTask {
    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybase", "ANSTab", "Alex17101988");
    Statement statement = connection.createStatement();

    public SqlTask() throws SQLException {
    }
    public ArrayList<CountryInfo> SqlGetListObj() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select country.name as 'назва країни',count(DISTINCT  region.name) as 'кількість регіонів'  , count(city.name) as 'кількість міст'\n" +
                "from  country left join region  on  country.id = region.country_id  \n" +
                " left join city on region.id = city.region_id\n" +
                "group by country.name\n" +
                "order by count(DISTINCT region.name) desc;");
        ArrayList<CountryInfo> cou = new ArrayList<>();
        while (resultSet.next()) {
            CountryInfo countryInfo = new CountryInfo(resultSet.getString(1), resultSet.getInt(2), resultSet.getInt(3));
            cou.add(countryInfo);
        }
        return cou;
    }

    public void DatabaseWithoutMysql () throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select country.name as 'назва країни',count(DISTINCT  region.name) as 'кількість регіонів'  , count(city.name) as 'кількість міст'\n" +
                "from  country left join region  on  country.id = region.country_id  \n" +
                " left join city on region.id = city.region_id\n" +
                "group by country.name\n" +
                "order by count(DISTINCT region.name) desc;");
        System.out.printf("%27s%35s%36s","Назва країни","Кількість регіонів","Кількість міст");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        while (resultSet.next()) {
            System.out.printf("%27s%30s%36s", resultSet.getString(1) + " ",resultSet.getInt(2) + " ",resultSet.getInt(3) + " "+"\n");
        }
    }



}
