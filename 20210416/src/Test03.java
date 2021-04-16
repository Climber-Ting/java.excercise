import java.util.*;
public class Test03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        StringBuilder s0=new StringBuilder();
        s0.append(str2).append(str1);
        int count=0;
        if (isPal(s0.toString())){
            count++;
        }
        for (int i=0;i<str1.length();i++){
            StringBuilder s=new StringBuilder();
            s.append(str1.substring(0,i+1));
            s.append(str2);
            s.append(str1.substring(i+1));
            if (isPal(s.toString())){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPal(String s){
        int i,j;
        for (i=0,j=s.length()-1;i<j;i++,j--){
            if (s.charAt(i)==s.charAt(j)){
                continue;
            }else {
                break;
            }
        }
        if (i==j||j+1==i){
            return true;
        }
        else {
            return false;
        }
    }
}
