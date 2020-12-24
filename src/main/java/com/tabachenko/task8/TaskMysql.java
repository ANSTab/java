package com.tabachenko.task8;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.xdevapi.Collection;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;

public class TaskMysql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        SqlTask sqlTask = new SqlTask();
        //System.out.println(sqlTask.SqlGetListObj());
        sqlTask.DatabaseWithoutMysql();
    }
}