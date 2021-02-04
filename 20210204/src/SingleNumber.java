import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={1,3,4,3,4,5,1};
        System.out.println(singleNumber1(nums));
    }
    public static int singleNumber1(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;

    }
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                set.remove(nums[i]);
            }
        }
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
