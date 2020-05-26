package com.fanthus.test;

import java.sql.*;

public class Test {
    public static void main(String[] args) {

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver"); //默认是不会加载的，这儿其实是将驱动类加载到内存类里
            //获取连接
            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
            String user = "root";
            String password = "fanthus"; //这儿密码如果写错的话就获取不到链接了
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println(connection);
            //'增删改'操作
            //构建 sql 语句
//            String insertSql = "insert into student(name, score) values('frank',78)";
//            String updateSql = "update student set name = 'fanthus'";
//            String deleteSql = "delete from student";
//            //构建 statement
//            Statement statement = connection.createStatement();
//            //使用 statement 执行更新
//            int result = statement.executeUpdate(insertSql);
//            System.out.println(result);

            //'查询'操作
            String sql = "select * from student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int score = resultSet.getInt("score");
                System.out.println(name+"-"+score);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
