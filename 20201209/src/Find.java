import java.util.*;
/*
数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
示例
输入：[1,2,5,9,5,9,5,5,5]
输出：5
 */
public class Find {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int ret=majorityElement(arr);
        System.out.println(ret);
    }
    public static int majorityElement(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);          //排序
        for(int i=0;i<=len/2;i++){
            int j=i+len/2;           //i j之差就是数组超过一半的长度
            if(nums[i]==nums[j]){
                return nums[i];
            }
        }
        return -1;
    }
}
