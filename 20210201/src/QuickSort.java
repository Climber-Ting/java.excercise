import java.util.*;
/*
快速排序：分治思想
时间复杂度：最好情况O(nlogn)  最坏情况O(n^2)
空间复杂度：O(logn)
稳定性：不稳定
 */
public class QuickSort {
    public static void quick(){

    }

    public static void quickSort(int[] array,int low,int high){
        if (low<high){

            int piv=pivot(array,0,high);
            quickSort(array,0,piv-1);
            quickSort(array,piv+1,high);
        }
    }
    public static int pivot(int[] array,int start,int end) {
        int tmp = array[start];
        while (start < end) {
            while (end>start && array[end]>=tmp) {
                end--;
            }
            //把数据赋值给start
            array[start]=array[end];

            while ( end>start && array[start]<=tmp) {
                start++;
            }
            //把start下标的值给end
            array[end]=array[start];
        }
        array[start] = tmp;
        return start;
    }

}
