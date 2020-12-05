import java.util.*;
/*
    猜数字游戏
    作业内容
    完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，
    还是等于随机生成的数字，等于的时候退出程序。
 */
public class GuessNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ran=(int)Math.random()*100;
        boolean flag=true;
        while(flag){
            int in=input.nextInt();
            if(in>ran){
                System.out.println("猜大了");
            }
            else if(in<ran){
                System.out.println("猜小了");
            }
            else{
                System.out.println("猜对了");
                flag=false;
            }
        }
    }
}
