import java.util.*;
/*
    模拟登陆
    作业内容
    编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
    提示“登录成功”,密码错误， 可以重新输入，最多输入三次。三次均错，则提示退出程序
 */
public class Login {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        String pass="123456";
        String s=" ";
        while(true){
            s=input.next();
            count++;
            if(count==3){
                if(s.equals(pass)){
                    System.out.println("登陆成功！");
                    break;
                }
                    System.out.println("输入密码已达三次，退出程序！");
                    break;
            }
            if(s.equals(pass)){
                System.out.println("登陆成功！");
                break;
            }
            else{
                System.out.println("密码错误，请重新输入");
            }
        }
    }
}

