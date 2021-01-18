import java.util.*;
/*
    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
    如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    你可以假设数组中无重复元素。
    示例 1:
    输入: [1,3,5,6], 5
    输出: 2
 */
public class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int ret=0;
        if(nums[0]>target){    //小于数组首元素
            ret=0;
        }
        if(nums[nums.length-1]==target){    //等于数组最后一个元素
            ret=nums.length-1;
        }
        if(nums[nums.length-1]<target){    //大于数组最后一个元素
            ret=nums.length;
        }
        for(int i=0;i<nums.length-1;i++){   //从首元素到倒数第二个遍历
            if(nums[i]==target){   //等于某个元素时
                ret=i;
                break;
            }
            if(nums[i]<target&&nums[i+1]>target){   //插入到 从首元素 到最后一个元素之间 的任意一个位置
                ret=i+1;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
