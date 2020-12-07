import java.util.*;
/*
    斐波那契数
    作业内容
    求斐波那契数列的第n项。(迭代实现)(递归实现)
 */

public class Feibonaqi {
    public static int f(int n) {
        if(n==1||n==2){
            return 1;
        }
        else{
            return f(n-2)+f(n-1) ;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ret=f(n);
        System.out.println("斐波那契数列第"+n+"项是"+ret);
    }
}
