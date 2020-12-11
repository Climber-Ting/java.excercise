import java.util.*;
/*
    求数组的平均值
    作业内容
    实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 */
public class avg {
    public static double avg(int[] arr) {
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8};
        System.out.println(avg(arr));
    }
}
