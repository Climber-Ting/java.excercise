import java.util.*;
/*
        旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
        现在给出应该输入的一段文字、以及实际被输入的文字，请你列出肯定坏掉的那些键。
输入描述:输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，
        由字母A-Z（包括大、小写）、数字0-9、以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
输出描述:按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
示例1
    输入 7_This_is_a_test<br/>_hs_s_a_es
    输出 7TI
 */
public class BadKey {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        String s2=input.next();
        TreeSet<Character> set=new TreeSet<>();
        int j=0;
        for(int i=0;i<s1.length();i++){
            char ch2=j<s2.length()?s2.charAt(j):';';
            if(ch2==s1.charAt(i)){
                j++;
            }
            else{
                if (s1.charAt(i)<='z'&&s1.charAt(i)>='a') {
                    set.add((char) (s1.charAt(i) - 32));
                }
                else {
                    set.add(s1.charAt(i));
                }
            }
        }
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char c=(char)((int)ch1-32);
            if (set.contains(ch1)){
                System.out.print(ch1);
                set.remove(ch1);
            }
            else if (set.contains(c)){
                System.out.print(c);
                set.remove(c);
            }
        }
    }
}
