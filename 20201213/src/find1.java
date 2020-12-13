import java.util.*;
/*
查找数组中的指定元素（二分查找）
 */
public class find1 {
    public static int findBinary(int[] arr,int dest) {
        int ret=0;
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left<=right){               //注意left==right的情况
            int mid=(left+right)/2;      //mid要在循环内定义
            if(arr[mid]>dest) {
                right = mid - 1;
            }
            else if(arr[mid]<dest){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,7,8,5,6};
        System.out.println(Arrays.binarySearch(arr,12));    //库函数，返回值是-（最右下标值+2）或-1
        System.out.println(findBinary(arr,7));
    }
}
