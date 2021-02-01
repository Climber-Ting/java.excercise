import java.util.Arrays;
import java.util.PriorityQueue;

/*
    给你一个非空数组，返回此数组中第三大的数 。如果不存在，则返回数组中最大的数。
示例 1：
    输入：[3, 2, 1]
    输出：1
    解释：第三大的数是 1 。
示例 2：
    输入：[1, 2]
    输出：2
    解释：第三大的数不存在, 所以返回最大的数 2 。
示例 3：
    输入：[2, 2, 3, 1]
    输出：1
    解释：注意，要求返回第三大的数，是指第三大且唯一出现的数。存在两个值为2的数，它们都排第二。
 */
public class ThirdMax {
    public static void main(String[] args) {
        int[] arr={2,2,3,1};
        System.out.println(thirdMax(arr));

    }
    public static int thirdMax(int[] nums) {

        PriorityQueue<Integer> qu=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            if ( qu.size()<3 ){
                qu.offer(nums[i]);
            }
            else{
                if (nums[i]>qu.peek()){
                    qu.poll();
                    qu.offer(nums[i]);
                }
            }
        }
        if (nums.length<3){
            while(qu.size()>1){
                qu.poll();
            }
        }
        return qu.peek();
    }
}
