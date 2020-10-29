import java.util.Date;

public class Announcement implements Activity
{
    String tag;
    String title;
    String body;
    Date date;
    public Announcement()
    {
        System.out.println("正在发布公告！");
        this.tag = "公告";
    }
    @Override
    public void ShowInfo() {
        System.out.println("活动类别为：" + this.tag+"，活动名称为：" + this.title);
        System.out.println(body+"\n "+date);
    }
}

