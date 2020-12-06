import java.util.*;
/*
    水仙花数
    作业内容
    求出0～999之间的所有“水仙花数”并输出。
    (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
    如；153＝1＋5＋3?，则153是一个“水仙花数“。）
 */
public class ShuiXianHua {
    public static void main(String[] args) {
//        for(int i=100;i<=999;i++){
//
//            int ge=i%10;
//            int shi=(i%100)/10;
//            int bai=i/100;
//            if(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==i){
//                System.out.print(i+" ");
//            }
//        }
        for(int i=1;i<=1000000;i++){
            //判断一个数是几位数
            int count=0;    //存i的位数
            int tmp=i;
            int sum=0;
            while(tmp!=0) {
                count++;
                tmp /= 10;
            }
            //计算幂的和
            tmp=i;
            while(tmp!=0){
                sum+=Math.pow(tmp%10,count);
                tmp=tmp/10;
            }
            //判断是否
            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }
}
