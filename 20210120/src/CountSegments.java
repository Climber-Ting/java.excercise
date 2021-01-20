import java.util.Arrays;
/*
    统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
    请注意，你可以假定字符串里不包括任何不可打印的字符。
    示例:
    输入: "Hello, my name is John"
    输出: 5
    解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 */
public class CountSegments {
    public static void main(String[] args) {
        String s=", , , ,        a, eaefa";
//        System.out.println(s);
//
//        StringBuilder str=new StringBuilder(s);
//        str.trimToSize();
//        System.out.println(str);
//
//        s.trim();
//        System.out.println(s.trim());
//        String[] s1=s.split("=");
//        System.out.println(Arrays.toString(s1));
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s){
        if(s==null){
            return 0;
        }
        String str=s.trim();
        if(str.isEmpty()){
            return 0;
        }
        String[] ss=str.split(" ");
        int ret=ss.length;
        for(int i=0;i<ss.length;i++){
            while(ss[i].startsWith(" ")){   //依次判断每个字符串是否是“ ”
                ss[i].trim();
            }
            if(ss[i].isEmpty()){      //如果是空格，则用库函数将它变为不含空格的，这样就可以自动过滤掉空格
                ret--;
            }
        }
        return ret;
    }
}
