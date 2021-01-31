import java.util.*;
/*
    给你一个整数数组nums，请编写一个能够返回数组“中心索引”的方法。
    数组中心索引是数组的一个索引，其左侧所有元素相加的和等于右侧所有元素相加的和。
    如果数组不存在中心索引，返回 -1 。如果数组有多个中心索引，应该返回最靠近左边的那一个。
    注意：中心索引可能出现在数组的两端。
示例 1：
    输入：nums = [1, 7, 3, 6, 5, 6]
    输出：3
    解释：
    索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
    同时, 3 也是第一个符合要求的中心索引。
 */
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int ret=-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int part=0;
        for(int i=0;i<nums.length-2;i++){
            part+=nums[i];
            if (i==0 && sum-part==0){
                ret=0;
                break;
            }
            if ( part*2 + nums[i+1]==sum){
                ret=i+1;
                break;
            }
        }
        if (sum-nums[nums.length-1]==0 && ret ==-1){
            ret=nums.length-1;
        }
        return ret;
    }
    public int pivotIndex1(int[] nums) {
        if (sum(nums,1,nums.length-1)==0){
            return 0;
        }
        if (sum(nums,0,nums.length-2)==0){
            return nums.length-1;
        }
        for(int i=1;i<nums.length-1;i++){
            if (sum(nums,0,i-1)==sum(nums,i+1,nums.length-1)){
                return i;
            }
        }
        return -1;
    }
    public int sum(int num[],int left,int right){
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=num[i];
        }
        return sum;
    }
}
