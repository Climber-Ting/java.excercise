import java.sql.SQLOutput;
import java.util.*;
/*
    求和的重载
    作业内容
    在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
    并执行代码，求出结果
 */
public class OverloadSum {
    public static int sum(int a,int b) {
        return a+b;
    }
    public static double sum(double a,double b,double c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int a=input.nextInt();
//        int b=input.nextInt();
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
       // System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
