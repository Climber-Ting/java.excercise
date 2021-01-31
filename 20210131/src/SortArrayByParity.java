import java.util.*;
/*
给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
你可以返回满足此条件的任何数组作为答案。
示例：
输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int end=A.length-1;
        int begin=0;
        while (begin<end) {
            if (A[begin]%2==0){
                if (A[end]%2==0){
                    begin++;
                }
                else {
                    begin++;
                    end--;
                }
            }
            else {
                if (A[end]%2==0){
                    int temp=A[end];
                    A[end]=A[begin];
                    A[begin]=temp;
                    begin++;
                    end--;
                }
                else {
                    end--;
                }
            }
        }
        return A;
    }
}
