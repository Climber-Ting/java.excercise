import java.util.*;
/*
    递归打印数字的每一位
    作业内容
    按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
 */
public class PrintNum {
    public static void printf(int n) {
        if(n<=9){
            System.out.print(n+" ");
        }
        else{
            printf(n/10);
            printf(n%10);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        printf(a);
    }
}
