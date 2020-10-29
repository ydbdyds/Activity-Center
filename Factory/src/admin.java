public class admin implements User
{
    long SUID;
    String name;
    String password;

    public admin()
    {
        System.out.println("创建管理员账号中...");

    }

    @Override
    public void show()
    {
    System.out.println("管理员账号姓名:"+this.name+",管理员ID:"+this.SUID);
    }
}
