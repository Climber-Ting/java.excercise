import java.util.*;
/*
    给你两个有序整数数组nums1和 nums2，请你将nums2合并到nums1中,使nums1成为一个有序数组。
    初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
    你可以假设 nums1 有足够的空间（空间大小等于 m + n）来保存 nums2 中的元素。
    示例 1：
    输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    输出：[1,2,2,3,5,6]
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m=3;
        int[] nums2={2,3,5,6};
        int n=4;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=m+n;
        int[] num3=new int[t];
        int k=0;
        if(n==0){    //若num2为空，不做任何操作
            return ;
        }
        if(m==0){    //若num1为空，将nums2的值nums1
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return ;
        }
        for(int i=0,j=0;i<m &&j<n;){
            if(nums1[i]>nums2[j]){
                num3[k]=nums2[j];
                j++;
                k++;
            }
            else if(nums1[i]<nums2[j]){
                num3[k]=nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]==nums2[j]){
                num3[k]=nums1[i];
                num3[k+1]=nums2[j];
                i++;
                k+=2;
                j++;
            }
            if(i==m){
                while(k<t&&j<n){
                    num3[k]=nums2[j];
                    j++;
                    k++;
                }
            }
            if(j==n){
                while(k<t&&i<m){
                    num3[k]=nums1[i];
                    i++;
                    k++;
                }
            }
        }
        for(int i=0;i<t;i++){
            nums1[i]=num3[i];
        }
        System.out.println(Arrays.toString(nums1));

    }
}
