import java.util.*;
/*
    数组的拷贝
    作业内容
    实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 */
public class CopyArray {
    public static int[] copyOf(int[] arr) {
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=arr[i];
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2=copyOf(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
