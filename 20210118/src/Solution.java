import java.util.*;

public class Solution {
    /*
    给你一个数组 nums和一个值 val，你需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。
    不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */
    //不完善算法
    public int removeElement1(int[] nums, int val) {
//        boolean flag = true;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j + 1];
//                    nums[j + 1] = nums[j];
//                    nums[j] = temp;
//                }
//                flag = false;
//            }
//            if (flag == true) {
//                break;
//            }
//        }
//        Arrays.sort(nums);

        if (nums.length == 1 && val == nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                break;
            }
            if (i==nums.length-1&&nums[i] == val) {
                return 0;
            }
        }

        int len = nums.length;
        int m = nums.length - 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val && nums[m] != val) {
                int temp = nums[i];
                nums[i] = nums[m];
                nums[m] = temp;
                m--;
                len--;
            } else if (nums[i] == val && nums[m] == val) {
                int temp = nums[i];
                nums[i] = nums[m - 1];
                nums[m - 1] = temp;
                m -= 2;
                len -= 2;
            } else if (nums[i] != val && nums[m] == val) {
                len--;
                m--;
                continue;
            }
        }
        return len;
    }

    //完善后的算法
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }
        int len=nums.length-count;
        int m=nums.length-1;
        for(int j=0;j<len;j++){
            if(nums[j]==val){
                nums[j]=nums[m];
                m--;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums={1,2,4,4,5};
        int val=4;
        Solution s=new Solution();
        System.out.println(s.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
