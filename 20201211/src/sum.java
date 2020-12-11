import java.util.*;
/*
    数组所有元素之和
    作业内容
    实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
 */
public class sum {
    public static double sum(double[] arr) {
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        double[] arr={1.0,3.7,4,5.8,6,7,8};
        System.out.println(sum(arr));
    }
}