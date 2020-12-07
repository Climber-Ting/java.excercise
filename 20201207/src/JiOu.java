import java.util.*;
/*
奇数位于偶数之前
作业内容
调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 */
public class JiOu {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6,8,10,7,9};
        int end=arr.length-1;
        for(int i=0,j=end;i<j;){
            if(arr[i]%2!=0 && arr[j]%2!=0){
                i++;
            }
            else if(arr[i]%2==0 && arr[j]%2==0){
                j--;
            }
            else if(arr[i]%2==0 && arr[j]%2!=0){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                i++;
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
