import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.util.*;
/*
    题目描述
    小乐乐喜欢数字，尤其喜欢0和1。他现在得到了一个数，想把每位的数变成0或1。
    如果某一位是奇数，就把它变成1，如果是偶数，那么就把它变成0。
    请你回答他最后得到的数是多少。

    输入描述:
    输入包含一个整数n (0 ≤ n ≤ 109)

    输出描述:
    输出一个整数，即小乐乐修改后得到的数字。

    示例1
    输入  222222
    输出  0
    示例2
    输入  123
    输出  101
 */
public class ChangNum {
        public static void main(String[] args){
            Scanner input =new Scanner(System.in);
            int n=input.nextInt();
            int a=n;
            String s="";
            while(n>9){
                if(a%2==0){
                    s='0'+s;
                }
                else{
                    s='1'+s;
                }
                n=n/10;
                a=n%10;
            }

            if(n%2==0){
                s='0'+s;
            }
            else{
                s='1'+s;
            }
            int ret=Integer.parseInt(s);
            System.out.println(ret);
        }

}
