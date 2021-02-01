import java.util.*;
/*
希尔排序：又叫缩小增量排序，增量必须为素数，且最后一个为1，
            在每个增量里采用直接插入排序
时间复杂度：最好O(n)  最坏O(n^2)
空间复杂度：O(1)
稳定性：不稳定排序
 */


public class ShellSort {
    public static void main(String[] args) {
        int[] array={8,2,4,7,9,13,25,3,5,0,67,23,12,6,1};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[] arr){
        int[] drr={5,3,1};
        for(int i=0;i<drr.length;i++){
            shell(arr,drr[i]);
        }
    }
    public static void shell(int[] arr,int gap){
        int i=gap;
        int temp=0;
        for (;i<arr.length;i++){
            int j=i-gap;
            temp=arr[i];
            for(;j>=0;j-=gap){
                if (arr[j]>temp){
                    arr[j+gap]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+gap]=temp;
        }
    }
}
