package solution;

import java.util.Arrays;

/*
    判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    示例 1:
    输入: 121
    输出: true
 */
public class IsPalindrome {
    //方法1 数学取余
    public boolean isPalindrome1(int x) {
        if(x < 0)
            return false;
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }
    //方法2 字符数组，首尾指针
    public boolean isPalindrome(int x) {
        String str=x+"";
        char[] ch=str.toCharArray();
        int i=0;
        int j=ch.length;
        while(i<j) {
            if (ch[i] == ch[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x=12;
        String str=x+"";
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(ch.length);
    }
}
