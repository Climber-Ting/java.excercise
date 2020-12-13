import java.util.*;
/*
    求数组中的最大元素
 */
public class max {
    public static int max(int[] arr) {
        if(arr==null){
            return 0;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,7,13,4,8,21};
        System.out.println(max(arr));
    }
}
