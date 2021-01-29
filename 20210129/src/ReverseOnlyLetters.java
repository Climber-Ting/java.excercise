import java.util.Arrays;

/*
给定一个字符串S，返回“反转后的”字符串，
其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
示例 1：
    输入："ab-cd"
    输出："dc-ba"
示例 2：
    输入："a-bC-dEf-ghIj"
    输出："j-Ih-gfE-dCba"
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }

    public static  String reverseOnlyLetters(String S) {
        int right=S.length()-1;
        int left=0;
        char[] ch=S.toCharArray();
        while(left<right){
            char r=ch[right];
            char l=ch[left];
            if (((r>='a'&&r<='z')||(r>='A'&&r<='Z'))&&((l>='a'&&l<='z')||(l>='A'&&l<='Z'))){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            else if (!((l>='a'&&l<='z')||(l>='A'&&l<='Z'))&&!((r>='a'&&r<='z')||(r>='A'&&r<='Z'))){
                left++;
                right--;
            }
            else if (!((l>='a'&&l<='z')||(l>='A'&&l<='Z'))&&((r>='a'&&r<='z')||(r>='A'&&r<='Z'))) {
                left++;
            }
            else {
                right--;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            str.append(ch[i]);
        }
        return str.toString();
    }
}
