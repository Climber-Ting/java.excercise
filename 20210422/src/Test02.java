import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=Integer.toString(n);
        StringBuilder ret=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            ret.append(str.charAt(i));
        }
        System.out.println(ret.toString());
    }
}
