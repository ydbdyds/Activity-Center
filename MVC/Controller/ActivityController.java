package Controller;


import entity.ActivityInformation;
import web.Servlet.ActivityService;

public class ActivityController {

    private ActivityService addAct = new ActivityService();

    //添加活动规则
    public ActivityInformation add(ActivityInformation act) {
        ActivityInformation actI = new ActivityInformation();
        boolean examination = addAct.add(act);
        try {
            if (act.get_credit() > 80) {
                System.out.println("发布成功");
            } else {
                System.out.println("发布失败");
            }
        } catch (Exception e) {
            System.out.println("系統異常");
        }

        return act;
    }
}
