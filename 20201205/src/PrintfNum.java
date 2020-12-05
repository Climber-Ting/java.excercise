import java.util.*;
/*
    输出一个整数的每一位
    作业内容
    输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
 */
public class PrintfNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String in=input.next();
        for(int i=0;i<in.length();i++){
            System.out.print(in.charAt(i)+" ");
        }
    }
}
