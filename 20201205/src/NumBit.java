import java.util.*;
/*
    二进制1的个数。
    作业内容
    求一个整数，在内存当中存储时，二进制1的个数。
 */
public class NumBit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        //int ret=num^Integer.MAX_VALUE;
        int count=0;
        for(int i=num;i>0; i=i>>1){
            if(i%2==1){
                count++;
            }
        }
        System.out.print(num+" 二进制中1的个数是"+count+"个");
    }
}
