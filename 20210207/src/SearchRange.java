import java.util.*;
/*
    给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
    如果数组中不存在目标值 target，返回 [-1, -1]。
    进阶：
    你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
示例 1：
    输入：nums = [5,7,7,8,8,10], target = 8
    输出：[3,4]
示例 2：
    输入：nums = [5,7,7,8,8,10], target = 6
    输出：[-1,-1]
示例 3：
    输入：nums = [], target = 0
    输出：[-1,-1]
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] nums={2,2};
        System.out.println(Arrays.toString(searchRange(nums,3)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ret={-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if (nums[left]<target && nums[right]>target){
                left++;
                right--;
            }
            else if (nums[right]>target){
                right--;
            }
            else if (nums[left]<target){
                left++;
            }
            else if (nums[left]==target&&nums[right]==target){
                ret[0]=left;
                ret[1]=right;
                break;
            }
        }
        return ret;
    }
    public int[] searchRange1(int[] nums, int target) {
        int[] ret={-1,-1};
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                int j=i+1;
                while(j<nums.length&&nums[j]==target){
                    j++;
                }
                ret[0]=i;
                ret[1]=j;
                break;
            }
            else if (nums[i]>target){
                break;
            }
        }
        return ret;
    }
}
