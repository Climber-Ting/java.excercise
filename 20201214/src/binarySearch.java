import java.util.*;
/*
    二分查找
    作业内容
    给定一个有序整型数组, 实现二分查找
 */
public class binarySearch {
    public static int binarySearch(int[] arr,int dest) {
        int left=0;
        int right=arr.length-1;
        int mid;
        while(left<=right){
            mid=(right+left)/2;
            if(arr[mid]>dest){
                right=mid-1;
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
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,7));
    }
}
