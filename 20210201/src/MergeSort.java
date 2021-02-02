import java.util.Arrays;
/*
归并排序：
时间复杂度：O(nlogn)
空间复杂度：O(n)
稳定性：稳定
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array={8,2,4,7,9,13,25,3,5,0,67,23,12,6,1};
        mergeSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] arr,int low,int high){
        mergeSortInternal(arr,low,high);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int s1=start;
        int s2=mid+1;
        int[] temp=new int[end-start+1];
        int k=0;//存放temp数组下标
        while(s1<=mid && s2<=end){
            if (arr[s1]<=arr[s2]){
                temp[k++]=arr[s1++];
            }
            else {
                temp[k++]=arr[s2++];
            }
        }
        while(s1<=mid){
            temp[k++]=arr[s1++];
        }
        while(s2<=end){
            temp[k++]=arr[s2++];
        }
        for (int i=0;i<temp.length;i++){
            arr[i+start]=temp[i];
        }
    }
    public static void mergeSortInternal(int[] arr,int low,int high){
        if (low>=high) return;
        int mid=(high+low)/2;
        mergeSortInternal(arr,low,mid);
        mergeSortInternal(arr,mid+1,high);
        merge(arr,low,mid,high);

    }

}
