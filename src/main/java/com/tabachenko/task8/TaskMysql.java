package com.tabachenko.task8;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class TaskMysql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybase", "ANSTab", "Alex17101988");
        // System.out.println("Є конекшен");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select country.name as 'назва країни',count(DISTINCT  region.name) as 'кількість регіонів'  , count(city.name) as 'кількість міст'\n" +
                "from  country left join region  on  country.id = region.country_id  \n" +
                " left join city on region.id = city.region_id\n" +
                "group by country.name\n" +
                "order by count(DISTINCT region.name) desc;");
        System.out.printf("%25s%35s%36s","Назва країни","Кількість регіонів","Кількість міст");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        while (resultSet.next()) {
            System.out.printf("%25s%30s%36s", resultSet.getString(1) + " ",resultSet.getInt(2) + " ",resultSet.getInt(3) + " "+"\n");
        }
    }
}