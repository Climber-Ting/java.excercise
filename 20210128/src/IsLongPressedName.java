import java.util.*;
/*
    你的朋友正在使用键盘输入他的名字name。偶尔，在键入字符c时，
    按键可能会被长按，而字符可能被输入 1 次或多次。你将会检查键盘输入的字符typed。
    如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回True。
示例 1：
    输入：name = "alex", typed = "aaleex"
    输出：true
    解释：'alex' 中的 'a' 和 'e' 被长按。
示例 2：
    输入：name = "saeed", typed = "ssaaedd"
    输出：false
    解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
示例 3：
    输入：name = "leelee", typed = "lleeelee"
    输出：true
示例 4：
    输入：name = "laiden", typed = "laiden"
    输出：true
    解释：长按名字中的字符并不是必要的。
 */
public class IsLongPressedName {
    public static void main(String[] args) {
        String name="pyplrz";
        String typed="ppyypllr";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (typed==null)
            return false;
        if(typed.length()<name.length())
            return false;
        int j=0;
        int i=0;
        while( i < name.length()){
            while (j < typed.length()) {
                if (typed.charAt(j) == name.charAt(i)) {
                    if (j == typed.length() - 1 && i==name.length()-1)
                        return true;
                    j++;
                    i++;
                    continue;
                } else if (j>=1 &&typed.charAt(j) == typed.charAt(j - 1) ) {
                    if (j == typed.length() - 1 && i==name.length()-1)
                        return true;
                    j++;
                    continue;
                } else {
                    return false;
                }
            }
        }

        while(j<typed.length()){
            if (typed.charAt(j)==typed.charAt(j-1)){
                if(j==typed.length()-1)
                    return true;
                j++;
                continue;
            }
            else{
                return false;
            }
        }
        return false;
    }
}

