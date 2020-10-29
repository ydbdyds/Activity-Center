import java.util.Date;
import java.util.Scanner;

public class AnnouncementFactory implements activityFactory
{
    @Override
    public Activity createActivity() {
        Scanner data = new Scanner(System.in);
        Activity activity = new Announcement();
        System.out.println("输入标题：");
        ((Announcement) activity).title=data.next();
        System.out.println("输入公告内容::");
        ((Announcement) activity).body=data.next();
        Date date =new Date();
        ((Announcement) activity).date = date;
        return activity;
    }
}
