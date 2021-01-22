import java.util.*;
/*
    输入一个字符串，求出该字符串包含的字符集合
输入描述:
    每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
输出描述:
    每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 */
public class Test1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //循环输入 循环输入！！！
        while(in.hasNext()){
            String str=in.nextLine();

            char[] ch=new char[str.length()];
            int m=str.length();

            ch[0]=str.charAt(0);
            for(int i=1,j=1;j<str.length();){
                if(!Arrays.toString(ch).contains(str.charAt(j)+"")){
                    ch[i]=str.charAt(j);
                    i++;
                    j++;
                }
                else if(Arrays.toString(ch).contains(str.charAt(j)+"")){
                    j++;
                    m--;
                }
            }
            StringBuilder s=new StringBuilder();
            for(int i=0;i<m;i++){
                s.append(ch[i]);
            }
            System.out.println(s);
        }
    }
}