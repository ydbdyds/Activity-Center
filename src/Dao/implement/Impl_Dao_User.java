package Dao.implement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


import Dao.Dao_User;
import entity.User;

public class Impl_Dao_User {
    //保存用户信息
    public void save(Connection conn, User user) throws SQLException {

    }

    //修改用户信息
    public void update(Connection conn, String userName, User user) throws SQLException {

    }

    //删除指定的用户信息
    public void delete(Connection conn, String userName) throws SQLException {

    }

    //查询用户信息
    public ResultSet get(Connection conn, User user) throws SQLException {

    }


    //按学号查找student

    public ResultSet getByNo(Connection conn, String stuNo) throws SQLException {

    }

    //查询所有student

    public static ResultSet getAll(Connection conn) throws SQLException {

    }
}
