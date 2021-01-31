import java.util.*;
/*
    给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
    定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
    找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
示例 1:
    输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
    输出: [1,2],[1,4],[1,6]
    解释: 返回序列中的前 3 对数：[1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 */
public class kSmallestPairs {
    public static void main(String[] args) {
        int[] nums1={1,7,11};
        int[] nums2={2,4,6};
        System.out.println(kSmallestPairs(nums1, nums2, 3));
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ret=new LinkedList<>();

        List<List<Integer>> list=new ArrayList<>();
        int len=nums1.length * nums2.length;
        int i=0;
        while(i<len){
            for(int j=0;j<nums1.length;j++){
                for(int m=0;m<nums2.length;m++){
                    List<Integer> listChild=new ArrayList<>();
                    listChild.add(nums1[j]);
                    listChild.add(nums2[m]);
                    i++;
                    list.add(listChild);
                }
            }
        }
        //建一个大堆，修改比较器
        PriorityQueue<List<Integer>> qu=new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int sum1=o1.get(0)+o1.get(1);
                int sum2=o2.get(0)+o2.get(1);
                return sum2-sum1;
            }
        });
        for(int t=0;t<list.size();t++){
            if(t<k){
                qu.offer(list.get(t));
            }
            else{
                int sum=list.get(t).get(0)+list.get(t).get(1);
                int sumPeek=qu.peek().get(0)+qu.peek().get(1);
                if (sum<sumPeek){
                    qu.poll();
                    qu.offer(list.get(t));
                }
            }
        }

        for(int a=0;a<k;a++){
            if (qu.peek()!=null){
                ret.add(qu.poll());
            }
        }
        return ret;
    }
}
