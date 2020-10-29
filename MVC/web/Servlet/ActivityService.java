package web.Servlet;

import java.sql.Connection;

import Dao.Dao_ActivityInformation;
import Dao.implement.Impl_Dao_ActivityInformation;
import entity.ActivityInformation;

public class ActivityService {
    private Dao_ActivityInformation daoAct = (Dao_ActivityInformation) new Impl_Dao_ActivityInformation();
    public boolean add(ActivityInformation actI){
        Connection conn = null;

        try {
            conn = ConnectionFactory.getInstance().makeConnection();
            conn.setAutoCommit(false);
            daoAct.save(conn, actI);
            conn.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }finally {
            try {
                conn.close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return false;
    }
}
