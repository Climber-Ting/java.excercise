import java.util.*;
/*
    返回的数字之和
    作业内容
    写一个递归方法，输入一个非负整数，返回组成它的数字之和
 */
public class SumOfNum {
    public static int sum(int n) {
        if(n<=9){
            return n;
        }
        else{
            return sum(n/10)+sum(n%10);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println(sum(a));
    }
}
