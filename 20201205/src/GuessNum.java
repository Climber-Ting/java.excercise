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

        //方法1
        //int ran=(int)Math.random()*100;
        //方法2
        Random random=new Random();  //括号里是随机种子，如果写入值，每次生成的随机数都相同
        int ran=random.nextInt(100)+1;

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
