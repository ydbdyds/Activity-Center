package Dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.ActivityInformation;
//接口
public interface Dao_ActivityInformation {
    public void save(Connection conn, ActivityInformation inf) throws SQLException;

    public void update(Connection conn, long id, ActivityInformation inf) throws SQLException;

    public void delete(Connection conn, ActivityInformation inf) throws SQLException;

    public ResultSet get(Connection conn, ActivityInformation inf) throws SQLException;

    public void delAll(Connection conn, String stuNo) throws SQLException;
}
