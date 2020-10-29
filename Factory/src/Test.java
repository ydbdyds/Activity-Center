import sun.nio.cs.US_ASCII;

public class Test {
    public static void main(String[] args)
    {
        activityFactory fa = new LuckyDrawFactory();
        activityFactory fb = new AnnouncementFactory();
        UserFactory uf = new UserFactory();
        User u1 = uf.createUser("发布者");
        u1.show();
       // Activity a1 = fa.createActivity();
      //  Activity a2 = fb.createActivity();
        //a1.ShowInfo();
       // a2.ShowInfo();
    }
}
