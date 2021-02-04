import java.util.*;
/*
给你两个二进制字符串，返回它们的和（用二进制表示）。输入为非空字符串且只包含数字1和0。
示例 1:
    输入: a = "11", b = "1"
    输出: "100"
示例 2:
    输入: a = "1010", b = "1011"
    输出: "10101"
 */
public class AddBinary {
    public static void main(String[] args) {
        String a="11";
        String b="1";
        System.out.println(addBinary(a, b));
    }
    //推荐使用
    public static String addBinary1(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
    //执行较慢
    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder str=new StringBuilder();
        int m=0;
        while(i>=0||j>=0){
            int sum=m;
            int n1=i>=0?a.charAt(i)-'0':0;
            int n2=j>=0?b.charAt(j)-'0':0;
            sum=n1+n2+m;
            m=sum/2;
            int n=sum%2;
            str.insert(0,n+"");
            i--;
            j--;
        }
        if (m==1){
            str.insert(0,1+"");
        }
        return str.toString();
    }

}
