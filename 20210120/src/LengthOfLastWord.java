import java.util.*;
/*
    给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
    如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
    如果不存在最后一个单词，请返回 0 。
    说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
    示例:
    输入: "Hello World"
    输出: 5
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s=", , , ,        a, eaefa";
        System.out.println(lengthOfLastWord2(s));
    }
    //方法二
//先试用trim方法将首尾空格删除，再将字符串放到数组中从后往前遍历，
// 遇空格停止，以此得出最后一个单词的长度
    public static int lengthOfLastWord2(String s) {
        if(s==null){
            return 0;
        }
        String str=s.trim();
        if(str.isEmpty()){
            return 0;
        }
        char[] ch=str.toCharArray();
        int count=0;
        int i=str.length()-1;
        while(ch[i]!=' '){
            count++;
            i--;
            if(i<0){
                break;
            }
        }
        return count;
    }
    //方法一 耗时长
    //先用split函数将字符串分割，在使用循环，依次将含有首尾含有空格的字符串处理，
    // 并将纯字母的字符串存储到新的数组中，最后返回此数组最后一个字符串的长度

    public static int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }
        String str=s.trim();
        if(str.isEmpty()){
            return 0;
        }
        String[] ss=str.split(" ");
        int len=ss.length;
        int ret=0;
        String[] sss=str.split(" ");    //此数组 用来保存只含有字母的字符串
        int j=0;
        for(int i=0;i<ss.length;i++){
            while(ss[i].startsWith(" ")){   //依次判断每个字符串是否是“ ”
                ss[i].trim();
            }

            if(!ss[i].isEmpty()){      //如果是空格，则用库函数将它变为不含空格的，这样就可以自动过滤掉空格
                sss[j]=ss[i];
                j++;
            }
        }
        ret=sss[sss.length-1].length();    //ret保存sss数组最后一个字符串的长度
        return ret;
    }
}
