import java.util.*;
/*
选择排序：从第一个元素开始，依次与后边所有的元素比较，
            每趟都将最小的元素与此趟的第一个元素交换
时间复杂度：O(n^2)
空间复杂度：O(1)
稳定性：不稳定
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] array={8,2,4,7,9,13,25,3,5,0,67,23,12,6,1};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
