import java.util.*;
/*
    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    你可以假设除了整数 0 之外，这个整数不会以零开头。
示例 1：
    输入：digits = [1,2,3]
    输出：[1,2,4]
    解释：输入数组表示数字 123。
示例 2：
    输入：digits = [4,3,2,1]
    输出：[4,3,2,2]
    解释：输入数组表示数字 4321。
示例 3：
    输入：digits = [0]
    输出：[1]
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] d={0};
        System.out.println(Arrays.toString(plusOne(d)));
    }
    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        for (int i=len-1;i>=0;i--){
            //从最后一位开始
            digits[i]++;
            digits[i]%=10;
            //只要满足下列条件，证明没有进位，否则将依次向前循环
            //如果直到第一个数字还在循环里，证明遇到了99,999,9999类似的情况，后边再处理
            if (digits[i]!=0){
                return digits;
            }
        }
        //此时则需要数组长度+1，然后给首元素置1
        digits=new int[len+1];
        digits[0]=1;
        return digits;
    }
}

