package solution;
import java.util.*;
import java.util.Arrays;
import java.lang.String;

/*
    给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
    判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
    如果可以构成，返回 true ；否则返回 false。
    (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。
    杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
    注意：
    你可以假设两个字符串均只含有小写字母。
    canConstruct("a", "b") -> false
    canConstruct("aa", "ab") -> false
    canConstruct("aa", "aab") -> true
 */
public class canConstruct {

//建两个数组分别存放各自字母的数量，在进行比较
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ran= ransomNote.toCharArray();
        char[] mag=magazine.toCharArray();
        if(ran.length>mag.length){
            return false;
        }
        int[] rans=new int[26];
        int[] mags=new int[26];
        for(char c:ran){
            rans[c-'a']++;
        }
        for(char c:mag){
            mags[c-'a']++;
        }
        for(int i=0;i<rans.length;i++){
            if(rans[i]>mags[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        canConstruct can=new canConstruct();
        boolean ret=can.canConstruct("","");
        System.out.println(ret);
    }

}