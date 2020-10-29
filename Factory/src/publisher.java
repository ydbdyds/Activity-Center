public class publisher implements User
{
    int credit;
    long PID;
    String name;
    String pwd;

    @Override
    public void show()
    {
        System.out.println("发布者账号，姓名:"+this.name+",发布者信誉值:"+credit);
    }
}
