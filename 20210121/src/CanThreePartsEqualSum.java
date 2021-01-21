import java.util.*;
/*
    给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
    形式上，如果可以找出索引 i+1 < j 且满足 
    A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] ==
    A[j] + A[j-1] + ... + A[A.length - 1] 就可以将数组三等分。
示例 1：
    输入：[0,2,1,-6,6,-7,9,1,2,0,1]
    输出：true
    解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
示例 2：
    输入：[0,2,1,-6,6,7,9,-1,2,0,1]
    输出：false
 */
//此算法关键在定义两个指针，且不可以同时移动
public class CanThreePartsEqualSum {

    //优化后的方法
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        if(sum%3 != 0){
            // 总和不是3的倍数，直接返回false
            return false;
        }
        sum=sum/3;
        int i=0;
        int j=arr.length-1;
        int sumI=arr[i];   //一开始只有一个元素，在循环中+=，提高效率
        int sumJ=arr[j];
        while(i+1<j){
            if(sumI==sum&&sumJ==sum){
                return true;
            }
            else if(sumI!=sum){
                //i++;
                //sumI+=arr[i];
                sumI+=arr[++i];     //算法亮点，省去多余的求和
            }
            else if(sumJ!=sum){
                //j--;
                //sumJ+=arr[j];
                sumJ+=arr[--j];
            }
        }
        return false;
    }

    //此方法可以运行成功，但效率太慢
    public static int sum(int[] arr,int i,int j){
        int sum=0;
        for(int m=i;m<=j;m++){
            sum+=arr[m];
        }
        return sum;
    }
    public static boolean canThreePartsEqualSum2(int[] arr) {
        int sum=sum(arr,0,arr.length-1)/3;
        int i=0;
        int j=arr.length-1;
        while(i+1<j){
            if(sum(arr,0,i)==sum&&sum(arr,i+1,j-1)==sum){
                return true;
            }
            else if(sum(arr,0,i)!=sum){
                i++;
            }
            else if(sum(arr,i+1,j-1)!=sum){
                j--;
            }
        }
        return false;
    }
    //此方法行不通
    public static boolean CanThreePartsEqualSum1 (int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(sum(arr,i,j-1)==sum(arr,j,k-1)&&+sum(arr,j,k-1)==sum(arr,k,arr.length-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,3,6,5,-2,2,5,1,-9,4};
        System.out.println(canThreePartsEqualSum(arr));
    }
}
