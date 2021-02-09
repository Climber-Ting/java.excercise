import java.util.*;
/*
    给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    说明：本题中，我们将定义为有效的回文串空字符串。
示例 1:
    输入: "A man, a plan, a canal: Panama"
    输出: true
示例 2:
    输入: "race a car"
    输出: false
 */
public class IsPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if (s==null||s.length()==0){
            return true;
        }
        int right=s.length()-1;
        int left=0;
        while(left<=right){
            boolean keyR=(s.charAt(right)<='z'&&s.charAt(right)>='a')||(s.charAt(right)<='Z'&&s.charAt(right)>='A');
            boolean keyL=(s.charAt(left)<='z'&&s.charAt(left)>='a')||(s.charAt(left)<='Z'&&s.charAt(left)>='A');
            boolean numL=s.charAt(left)>=48&&s.charAt(left)<=57;
            boolean numR=s.charAt(right)>=48&&s.charAt(right)<=57;
            if (!keyL&&!numL) {
                left++;
                continue;
            }
            if (!keyR&&!numR){
                right--;
                continue;
            }
            if (keyL&&keyR){
                int a=s.charAt(left);
                int b=s.charAt(right);
                if (s.charAt(right)==s.charAt(left)||Math.abs(s.charAt(left)-s.charAt(right))==32){
                    left++;
                    right--;
                }
                else {
                    return false;
                }
            }
            else if (numL&&numR){
                if (s.charAt(right)==s.charAt(left)){
                    left++;
                    right--;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        if (left-1==right+1||left-1==right){
            return true;
        }
        else {
            return false;
        }
    }
}
