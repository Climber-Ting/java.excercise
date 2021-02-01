import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
堆排序：
时间复杂度：O(nlogn)
空间复杂度：O(1)
稳定性：不稳定
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array={8,2,4,7,9,13,25,3,5,0,67,23,12,6,1};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void heapSort(int[] arr){
        PriorityQueue<Integer>  qu=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<arr.length;i++){
            qu.offer(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=qu.poll();
        }
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int temp=arr[0];
            arr[0]=arr[j];
            arr[j]=temp;
            shiftDown(arr,0,j);
            j--;
        }
    }
    public static void shiftDown(int[] arr,int parent,int len){
        int child=parent*2+1;
        while(child<len){
            //有右孩子
            if (child+1<len){
                if (arr[child]<arr[child+1]){
                    child++;
                }
            }
            //此时child指向了最大孩子的下标
            if (arr[child]>arr[parent]){
                int temp=arr[child];
                arr[child]=arr[parent];
                arr[parent]=temp;
                parent=child;
                child=parent*2+1;
            }
            else {
                parent=child;
                child=parent*2+1;
            }
        }
    }
}
