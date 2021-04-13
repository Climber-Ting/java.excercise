import java.util.*;
public class Str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String ret=reverse(str);
        StringBuilder end=new StringBuilder();
        String temp;
        int start=0;
        for (int i=0;i<ret.length();i++){
            if (i==ret.length()-1){
                temp=ret.substring(start,i+1);
                end.append(reverse(temp));
            }
            if (ret.charAt(i)!=' '){
                continue;
            }
            else{
                temp=ret.substring(start,i);
                end.append(reverse(temp));
                end.append(' ');
                start=i+1;
            }

        }
        System.out.println(end.toString());
    }

    public static String reverse(String s) {
        StringBuilder ret=new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            ret.append(s.charAt(i));
        }
        return ret.toString();
    }
}
