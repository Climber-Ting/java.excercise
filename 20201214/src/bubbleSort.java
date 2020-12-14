import java.util.*;
/*
    冒泡排序
    作业内容
    给定一个整型数组, 实现冒泡排序(升序排序)
 */
public class bubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                flag=false;
            }
            if(flag==true){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4,7,8,6,5,9};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
