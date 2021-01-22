import java.util.*;

public class Test {
    public static List<Character> fun(String s1,String s2){
        List<Character> list=new ArrayList<>();

        boolean flag=true;
        for(int i=0;i<s1.length();i++){
            //时间复杂度O（n^2） 不推荐使用
//            for(int j=0;j<s2.length();j++){
//                if(s2.charAt(j)==s1.charAt(i)){
//                    flag=false;
//                    continue;
//                }
//            }
//            if(flag){
//                list.add(s1.charAt(i));
//            }
            //优化后的方法
            char ch=s1.charAt(i);
            if(!s2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s1="welcome to bit";
        String s2="come";
        System.out.println(fun(s1, s2));
    }
}
