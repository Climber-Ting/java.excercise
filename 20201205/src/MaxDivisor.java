import java.util.*;
/*
    最大公约数
    作业内容
    求两个正整数的最大公约数
 */
public class MaxDivisor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        //普通算法
        //int min=num1<num2?num1:num2;
//        for(int i=min;i>=2;i--){
//            if(num1%i==0&&num2%i==0){
//                System.out.println(num1+"和"+num2+"的最大公约数是"+i);
//                break;
//            }
//        }

        //辗转相除法
        int c=1;
        int a=num1;
        int b=num2;
        while(num1%num2!=0){
            c=num1%num2;
            num1=num2;
            num2=c;
        }
        System.out.println(a+"和"+b+"的最大公约数是"+c);
    }
}
