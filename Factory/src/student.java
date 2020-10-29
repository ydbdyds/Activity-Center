public class student implements User
{
    String name;
    String password;
    long  id;
    public void addFavorites(){}
    public void deleFavorite(){}

    @Override
    public void show()
    {
     System.out.println("学生账号姓名："+this.name+"，学号:"+id);
    }
}
