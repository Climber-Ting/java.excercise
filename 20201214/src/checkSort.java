import java.util.*;
/*
    数组是否有序
    作业内容
    给定一个整型数组, 判定数组是否有序（递增）
 */
public class checkSort {
    public static boolean checkSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2={1,3,4,5,2,6,7};
        boolean f1=checkSort(arr1);
        boolean f2=checkSort(arr2);
        System.out.println(f1);
        System.out.println(f2);
    }
}
