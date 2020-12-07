import java.util.*;
import java.lang.String;
/*
    求最大值方法的重载
    作业内容
    在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
 */
public class OverloadMax {
    public static int max(int a,int b) {
        return a>b?a:b;
    }
    public static double max(double a,double b) {
        return a>b?a:b;
    }
    public static double max(double a,double b,int c) {
        return (a>b?a:b)>c?(a>b?a:b):c;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        //int c=input.nextInt();
        System.out.println(a+" "+b+" "+"的最大值是："+max(a,b));
    }
}
