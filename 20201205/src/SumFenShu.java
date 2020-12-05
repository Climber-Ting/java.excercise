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
        for(int i=1;i<=100;i++){
            a=1.0/i;
            if(i%2!=0){
                sum+=a;
            }
            else{
                sum-=a;
            }
        }
        System.out.println(sum);
    }
}
