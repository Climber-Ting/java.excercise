import java.util.*;
/*
    检查数组有序性
 */
public class isUp {
    public static boolean isUp(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr1={1,2,3,4,6,7,4,6};
        boolean a=isUp(arr);
        boolean b=isUp(arr1);
        System.out.println(a);
        System.out.println(b);
    }
}
