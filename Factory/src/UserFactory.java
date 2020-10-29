import java.util.Scanner;

public class UserFactory {
    public User createUser(String type) {
        User user = null;
        Scanner data = new Scanner(System.in);
        if ("管理员".equals(type)) {

            user = new admin();
            System.out.println("输入管理员账号昵称:");
            ((admin) user).name = data.next();
            ((admin) user).SUID =System.currentTimeMillis();
        }
        else if("学生".equals(type)){
            user = new student();
            System.out.println("输入学生账号昵称:");
            ((student) user).name = data.next();
            System.out.println("请输入学号:");
            ((student) user).id = Long.parseLong(data.next());
        }
        else if("发布者".equals(type)){
            user = new publisher();
            System.out.println("输入发布者账号昵称:");
            ((publisher) user).name = data.next();
            ((publisher) user).PID =System.currentTimeMillis();
            ((publisher) user).credit = 50;
        }
        return user;
    }

}
