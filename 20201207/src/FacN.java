import java.util.*;
/*
    递归求 N 的阶乘
    作业内容
    递归求 N 的阶乘
 */
public class FacN {
    public static int fac(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println(fac(a));
    }
}
