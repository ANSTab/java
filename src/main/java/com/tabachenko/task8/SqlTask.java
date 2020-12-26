package com.tabachenko.task8;

import java.sql.*;
import java.util.ArrayList;

public class SqlTask extends CountryInfo {

    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybase", "ANSTab", "Alex17101988");
    Statement statement = connection.createStatement();

    public SqlTask() throws SQLException {
    }

    public ArrayList SqlGetListObj() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select country.name as 'назва країни',count(DISTINCT  region.name) as 'кількість регіонів'  , count(city.name) as 'кількість міст'\n" +
                "from  country left join region  on  country.id = region.country_id  \n" +
                " left join city on region.id = city.region_id\n" +
                "group by country.name\n" +
                "order by count(DISTINCT region.name) desc;");
        ArrayList cou = new ArrayList<>();
        while (resultSet.next()) {
            CountryInfo countryInfo = new CountryInfo(resultSet.getString(1), resultSet.getInt(2), resultSet.getInt(3));
            cou.add(countryInfo);

        }
        return cou;
    }

    public void DatabaseWithoutMysql() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select country.name as 'назва країни',count(DISTINCT  region.name) as 'кількість регіонів'  , count(city.name) as 'кількість міст'\n" +
                "from  country left join region  on  country.id = region.country_id  \n" +
                " left join city on region.id = city.region_id\n" +
                "group by country.name\n" +
                "order by count(DISTINCT region.name) desc;");
        System.out.printf("%27s%35s%36s", "Назва країни", "Кількість регіонів", "Кількість міст");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        while (resultSet.next()) {
            System.out.printf("%27s%30s%36s", resultSet.getString(1) + " ", resultSet.getInt(2) + " ", resultSet.getInt(3) + " " + "\n");
        }
    }

    public void DatabaseUpd(int idCountru, String coutnryName, int idRegion, String regionName, String cityName) throws SQLException {
        statement.executeUpdate(" insert into country(id, name) values (" + idCountru + ", '" + coutnryName + "');");
        statement.executeUpdate("insert into region(id, country_id, name) values (" + idRegion + "," + idCountru + ", '" + regionName + "');");
        statement.executeUpdate("insert into city(region_id, name) values (" + idRegion + ", '" + cityName + "');");

        System.out.println("Database update, object created");
    }

    public void allBase() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select country.name ,region.name , city.name\n" +
                "from  country left join region  on  country.id = region.country_id  \n" +
                " left join city on region.id = city.region_id;");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+"      "+resultSet.getString(2)+"    "+resultSet.getString(3));
        }
    }
}
