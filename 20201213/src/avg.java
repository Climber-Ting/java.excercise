import java.util.*;
/*
    求数组中元素的平均值
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
        int[] arr={1,2,4,5,7,8,9,3,12};
        System.out.println(avg(arr));
    }
}
