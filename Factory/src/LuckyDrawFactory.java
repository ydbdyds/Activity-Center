import java.util.Scanner;

//public  class
public class LuckyDrawFactory implements activityFactory
{
    @Override
    public Activity createActivity() {
        Scanner data = new Scanner(System.in);
        Activity activity = new LuckyDraw();
        System.out.println("输入标题：");
        ((LuckyDraw) activity).title=data.next();
        System.out.println("输入活动文案::");
        ((LuckyDraw) activity).body=data.next();
        return activity;
    }
}
