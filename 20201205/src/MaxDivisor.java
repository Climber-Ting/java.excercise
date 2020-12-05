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
        int min=num1<num2?num1:num2;
        for(int i=min;i>=2;i--){
            if(num1%i==0&&num2%i==0){
                System.out.println(num1+"和"+num2+"的最大公约数是"+i);
                break;
            }
        }
    }
}
