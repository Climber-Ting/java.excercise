import java.util.*;
/*
    数字9 出现的次数
    作业内容
    编写程序数一下 1到 100 的所有整数中出现多少个数字9
 */

public class Shu9 {
    public static void main(String[] args) {
        int count=0;
        //数100以内一共有几个9
//        for(int i=1;i<=100;i++){
//            String s=i+" ";
//            int len=s.length();
//            for(int j=0;j<len;j++) {
//                if (s.charAt(j) == '9') {
//                    count++;
//                }
//            }
//        }
        //数100以内有几个数含9
        for(int i=1;i<=100;i++){
            if(i%10==9||i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
}
