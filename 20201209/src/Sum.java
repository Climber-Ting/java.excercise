import java.util.*;
/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,5,6,7,8,10};
        int target=input.nextInt();
        int[] ret=twoSum(arr,target);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        if(nums==null){
            return null;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    //return arr;
                    return new int[]{i,j};  // 匿名数组
                }
            }
        }
        return null;
    }
}
