import java.util.*;
/*
    判定素数

    作业内容
    给定一个数字，判定一个数字是否是素数
 */
public class IfSushu {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int in=input.nextInt();
       for(int i=2;i<=in;i++){
           if(i==in){
               System.out.println(in+"是素数");
               break;
           }
           if(in%i==0){
               System.out.println(in+"不是素数");
               break;
           }
       }
    }
}
