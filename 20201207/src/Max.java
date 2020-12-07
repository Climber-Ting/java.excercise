import java.util.*;
/*
    求最大值
    作业内容
    创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    ​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
 */
public class Max {
    public static int max2(int a,int b) {
        return a>b?a:b;
    }
    public static int max3(int a,int b,int c) {
        int max=max2(a,b);
        return max>c?max:c;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=max3(a,b,c);
        System.out.println(a+" "+b+" "+c+" "+"的最大值是："+max);
    }
}
