import java.util.*;
/*
    计算分数的值

    作业内容
    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
 */
public class SumFenShu {
    public static void main(String[] args) {
        double sum=0;
        double a=0;
        // 普通算法
//        for(int i=1;i<=100;i++){
//            a=1.0/i;
//            if(i%2!=0){
//                sum+=a;
//            }
//            else{
//                sum-=a;
//            }
//        }

        //定义一个标志k，标识分数的正负
        int k=1;
        for(int i=1;i<=100;i++){
            a=(1.0/i)*k;
            sum+=a;
            k=-k;
        }
        System.out.println(sum);
    }
}
