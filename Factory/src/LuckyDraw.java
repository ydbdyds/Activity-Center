import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class LuckyDraw implements Activity
{
    String tag ;
    String title;
    String body;

    public LuckyDraw()
    {
    System.out.println("正在发布抽奖活动！");
    this.tag = "抽奖活动";

    }
    @Override
    public void ShowInfo(){
        System.out.println("活动类别为：" + this.tag+"，活动名称为：" + this.title);
        System.out.println(body);
    }

}
