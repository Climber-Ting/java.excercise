import java.util.*;
/*
    给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
    判断二者是否相等，并返回结果。 # 代表退格字符。
    注意：如果对空文本输入退格字符，文本继续为空。
示例 1：
    输入：S = "ab#c", T = "ad#c"
    输出：true
    解释：S 和 T 都会变成 “ac”。
示例 2：
    输入：S = "a#c", T = "b"
    输出：false
    解释：S 会变成 “c”，但 T 仍然是 “b”。
 */
public class BackspaceCompare {

    public static boolean backspaceCompare(String S, String T) {
        StringBuilder s1=new StringBuilder();
        StringBuilder t1=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#'&&s1.length()>=1){
                s1.deleteCharAt(s1.length()-1);
            }
            else if(S.charAt(i)=='#'&&s1.length()==0){

            }
            else {
                s1.append(S.charAt(i));
            }
        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='#'&&t1.length()>=1){
                t1.deleteCharAt(t1.length()-1);
            }
            else if(T.charAt(i)=='#'&&t1.length()==0){

            }
            else {
                t1.append(T.charAt(i));
            }
        }
        String s=s1.toString();
        String t=t1.toString();
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String S="ab#c";
        String T="ad#c";
        System.out.println(backspaceCompare(S, T));
    }
}
