import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(insertSort(arr)));
    }

    //直接插入排序，时间复杂度O(nlogn) 空间复杂度O(1)
    public static int[] insertSort(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int j=i-1;
            int temp=arr[i];
            for (;j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
