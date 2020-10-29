package entity;
import com.sun.javaws.security.AppPolicy;

import java.util.Date;
import java.util.List;
import java.lang.Exception;

public class User {
    private String userName;//用户名
    private String favorite;//收藏
    private String comment;//评论
    private List<Date> remind;//提醒

    public String get_userName() {
        return userName;
    }

    public void setStuNo(String userName) {
        this.userName = userName;
    }

    public List<Date> Remind() {
        return remind;
    }

    public void AddRemind(Date date){
        if(Remind().contains(date))
            try {
                throw new Exception("添加错误："+ date +" 已经存在提醒!");
            } catch (Exception e) {
                System.out.println("输入日期错误");
            }
        Remind().add(date);
    }

    public void RemoveRemind(Date date) {
        Remind().remove(date);
    }


    public String get_comment() {
        return comment;
    }

    public void set_comment(String comment) {
        this.comment = comment;
    }

    public String get_favorite() {
        return favorite;
    }

    public void set_favorite(String favorite) {
        this.favorite = favorite;
    }


    @Override
    public String toString() {
        return "User [userName=" + userName + ", favorite=" + favorite + ", " +
                "comment=" + comment + ",remind=" + remind + "]";
    }

}

