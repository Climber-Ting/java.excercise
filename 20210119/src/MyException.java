import javax.security.auth.login.LoginException;
import java.util.*;
public class MyException {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String code=in.next();
        String key="123456";
        if(!key.equals(code)){
            try{
                throw new LoginException("密码错误！");
            }catch(LoginException e){
                e.printStackTrace();
            }

        }
        System.out.println("登录成功");
    }

}
