import java.util.*;
/*
给你一个整数数组 nums ，你需要找出一个 连续子数组 ，
如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
请你找出符合题意的 最短 子数组，并输出它的长度。
示例 1：
    输入：nums = [2,6,4,8,10,9,15]
    输出：5
    解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
示例 2：
    输入：nums = [1,2,3,4]
    输出：0
示例 3：
    输入：nums = [1]
    输出：0
 */
public class FindUnsortedSubarray {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 2, 3, 3};
//        int[] num2 = {1, 3, 2, 2, 2};
        int[] num3 = {2, 6, 4, 8, 10, 9, 15};
        int[] num4 = {2, 3, 3, 2, 4};
        int[] num5 = {1,3,5,4,2};
//        System.out.println(findUnsortedSubarray(nums));
//        System.out.println(findUnsortedSubarray(num2));
        System.out.println(findUnsortedSubarray(num3));
        System.out.println(findUnsortedSubarray(num4));
        System.out.println(findUnsortedSubarray(num5));
    }
    //使用栈，顺序放入判断左边界，逆序放入判断右边界
    public static int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int left=nums.length-1;
        int right=0;
        for (int i=0;i<nums.length;i++){
            while (!stack.isEmpty()&&nums[i]<nums[stack.peek()]){
                left=Math.min(stack.pop(),left);
            }
            stack.push(i);
        }
        stack.clear();
        for (int i=nums.length-1;i>=0;i--){
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                right=Math.max(stack.pop(),right);
            }
            stack.push(i);
        }
        if (right>left){
            return right-left+1;
        }else {
            return 0;
        }
    }
}
