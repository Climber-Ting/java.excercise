import java.util.*;

public class Test2 {
    /*
    给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
    进阶：
    尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
    你可以使用空间复杂度为O(1)的原地算法解决这个问题吗？
     */
    public static void rotate(int[] nums, int k) {
        int start=nums.length-k;
        int num1[]=new int[nums.length];
        int a=start;
        int b=0;
        for(int i=0;i<nums.length;i++) {
            if(i<k){
                num1[i] = nums[a];
                a++;
            }
            else{
                num1[i]=nums[b];
                b++;
            }
        }
        System.out.println(Arrays.toString(num1));
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int k=3;
        rotate(num,k);
    }
}
