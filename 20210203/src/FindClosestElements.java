import java.util.*;
/*
    给定一个排序好的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。
    返回的结果必须要是按升序排好的。
整数 a 比整数 b 更接近 x 需要满足：
    |a - x| < |b - x| 或者
    |a - x| == |b - x| 且 a < b
示例 1：
    输入：arr = [1,2,3,4,5], k = 4, x = 3
    输出：[1,2,3,4]
示例 2：
    输入：arr = [1,2,3,4,5], k = 4, x = -1
    输出：[1,2,3,4]
 */
public class FindClosestElements {
    //官方解法，时间复杂度O(nlogn)
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Collections.sort(ret, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
//        ret = ret.subList(0, k);
//        Collections.sort(ret);
//        return ret;
//    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        int left=0;
        int right=0;
        for(int i=0;i<arr.length;i++){
            if (arr[0]>x){
                left=0;
                right=1;
                break;
            }
            if (arr[arr.length-1]<x){
                left=arr.length-1;
                right=arr.length;
                break;
            }
            if (arr[i]==x){
                left=i;
                right=i+1;
                break;
            }
            else if (arr[i]<x && arr[i+1]>x){
                left=x-arr[i]<=arr[i+1]-x?i:i+1;
                right=left+1;
                break;
            }
        }

        while(left>=0 && right<arr.length && k>0){
            if (x-arr[left]<=arr[right]-x){
                list.add(arr[left]);
                left--;
                k--;
            }
            else {
                list.add(arr[right]);
                right++;
                k--;
            }
        }
        if (k>0){
            while (right<arr.length && k>0){
                list.add(arr[right]);
                right++;
                k--;
            }
            while(left>=0 && k>0){
                list.add(arr[left]);
                left--;
                k--;
            }
        }
        Collections.sort(list);
        return list;

    }
}
