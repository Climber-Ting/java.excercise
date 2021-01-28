import java.util.*;
/*
给定一个整数数组，判断是否存在重复元素。
如果存在一值在数组中出现至少两次，函数返回 true 。
如果数组中每个元素都不相同，则返回 false 。
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate1(nums));
    }
    //时间复杂度O(NlogN) 要对数组进行排序
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length==0)
            return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    //此方法超出时间限制
    public static boolean containsDuplicate1(int[] nums) {
        if(nums.length==0)
            return false;
        StringBuilder s=new StringBuilder();
        String m=nums[0]+",";
        s.append(m);
        for(int i=1;i<nums.length;i++){
            String ch=nums[i]+",";
            String str=s.toString();
            if(str.contains(ch)){
                return true;
            }else {
                s.append(ch);
            }
        }
        return false;
    }
}
