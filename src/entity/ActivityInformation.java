package entity;

import java.util.Date;

public class ActivityInformation {
    private String tag;//标签
    private String body;//内容
    private Date time;//活动日期
    private String userName;//用户名（发布人）
    private int credit;//信誉

    public int get_credit() {
        return credit;
    }

    public void set_credit(int credit) throws Exception {
        if(credit < 80) {
            throw new Exception("credit must >= 80");
        }
        this.credit = credit;
    }


    public String get_tag() {
        return tag;
    }

    public void set_tag(String tag) {
        this.tag = tag;
    }

    public String get_body() {
        return body;
    }

    public void set_body(String body) {
        this.body = body;
    }

    public Date getTime() {
        return time;
    }

    public void setTime() {
        this.time = new Date();
    }

    public String get_userName() {
        return userName;
    }

    public void set_userName(String stuNo) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "Activity [time=" + time + ",tag=" + tag + ", " +
                "body=" + body +",  userName=" + userName +  "]";
    }

}