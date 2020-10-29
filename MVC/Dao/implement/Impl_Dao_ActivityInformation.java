package Dao.implement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import Dao.Dao_ActivityInformation;
import entity.ActivityInformation;
public class Impl_Dao_ActivityInformation {


    //添加一个活动
    public void save(Connection conn, ActivityInformation inf) throws SQLException {
        String saveSql = "INSERT INTO ";
        //未完成
    }

    //修改活动
    public void update(Connection conn, long id, ActivityInformation inf) throws SQLException {
        String saveSql = "UPDATE ";
    }

    //删除活动
    public void delete(Connection conn, ActivityInformation inf) throws SQLException {
        String updateSql = "DELETE FROM ";
    }

    //按发布人或活动ID查询
    public ResultSet get(Connection conn, ActivityInformation inf) throws SQLException {
        String getSql = "SELECT * FROM ";
    }

    //删除某发布人的全部活动
    public void delAll(Connection conn, ActivityInformation inf) throws SQLException {

    }

    //查找所有活动
    public static ResultSet getAll(Connection conn) throws SQLException {

    }
}
