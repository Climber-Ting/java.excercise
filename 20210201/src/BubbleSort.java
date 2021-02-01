import java.util.Arrays;

/*
冒泡排序：
时间复杂度：O(n^2)
空间复杂度：O(1)
稳定性：稳定
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array={8,2,4,7,9,13,25,3,5,0,67,23,12,6,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            boolean isOrder=true;
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isOrder=false;
                }
            }
            if (isOrder){
                break;
            }
        }
    }
}

