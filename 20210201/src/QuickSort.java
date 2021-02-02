import java.util.*;
/*
快速排序：分治思想
效率最高：每次将待排序的元素均匀地划分
时间复杂度：最好情况O(nlogn)  最坏情况O(n^2) (有序情况是最坏情况，即越有序越慢)
空间复杂度：O(logn)
稳定性：不稳定
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array={8,2,4,7,9,13,25,3,5,0,67,23,12,6,1};
        quick(array);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSortFeidigui(int[] array,int low,int high){

    }
    public static void quick(int[] array){
        quickSort(array,0,array.length-1);

    }
    public static void swap(int[] array,int k,int i) {
        int tmp = array[k];
        array[k] = array[i];
        array[i] = tmp;
    }
    public static void medianOfThree(int[] array,int low,int high) {
        int mid = (low+high)/2;
        //array[mid] <= array[low] <= array[end]
        if(array[low] < array[mid]) {
            swap(array,low,mid);
        }//array[mid] <= array[low]
        if(array[low] > array[high]) {
            swap(array,low,high);
        }//array[low] <= array[high]
        if(array[mid] > array[high]) {
            swap(array,mid,high);
        }//array[mid] <= array[high]
    }
    public static void insertSort(int[] array,int low,int high){
        int i,j;
        for (i=low;i<high;i++){
            int temp=array[i];
            for (j=i-1;j>=low;j--){
                if (array[j]>temp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=temp;
        }
    }
    public static void quickSort(int[] array,int low,int high){
        if(high-low+1<50){
            insertSort(array,low,high);
        }
        if (low<high){
            medianOfThree(array,low,high);
            //在这之前优化，即优化选基准的方法
            int piv=pivot(array,low,high);
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
