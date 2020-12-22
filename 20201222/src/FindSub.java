import java.util.*;
/*
题目描述
在庆祝祖国母亲70华诞之际，老师给小乐乐出了一个问题。大家都知道China的英文缩写是CHN，
那么给你一个字符串s，你需要做的是统计s中子串“CHN”的个数。
子串的定义：存在任意下标a < b < c，那么“s[a]s[b]s[c]”就构成s的一个子串。如“ABC”的子串有“A”、“B”、“C”、“AB”、“AC”、“BC”、“ABC”。

输入描述:
输入只包含大写字母的字符串s。(1 ≤ length ≤ 8000)
输出描述:
输出一个整数，为字符串s中字串“CHN”的数量。
    示例1
    输入  CCHNCHN
    输出   7
 */
public class FindSub{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        long count=0;
        long c=0;
        long h=0;
        String si="CHN";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='C'){
                c++;
            }
            else if(s.charAt(i)=='H'){
                h+=c;
            }
            else if(s.charAt(i)=='N'){
                count+=h;
            }
        }
        System.out.println(count);
    }
}