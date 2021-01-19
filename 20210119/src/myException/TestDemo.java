package myException;
import java.util.*;
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class TestDemo {
    private static String userName = "admin";
    private static String password = "admin";

    public static void login(String userName, String password) {
        if (!TestDemo.userName.equals(userName)) {
            try {
                throw new UserException("用户名错误");
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
        if (!TestDemo.password.equals(password)) {
            try {
                throw new PasswordException("密码错误");
            } catch (PasswordException e) {
                e.printStackTrace();
            }
        }

    }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        String code=in.next();
        login(name,code);
    }
}
