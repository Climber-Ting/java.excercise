import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        StringBuilder ret=new StringBuilder();

        for (int i=0;i<str1.length();i++){
            boolean flag=true;
            for (int j=0;j<str2.length();j++){
                if (str1.charAt(i)==str2.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if (flag) {
                ret.append(str1.charAt(i));
            }
        }
        System.out.println(ret.toString());
    }
}
