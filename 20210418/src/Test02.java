import java.util.*;
public class Test02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(StrToInt(str));
    }

    public static int StrToInt(String str) {
        int pr = 0;
        boolean f = true;
        if(str.length() == 0) return 0;     //如果输入空，要特殊判断，否则后边会报空指针异常
        while (str.charAt(pr) == ' ') {
            pr++;
        }
        if (str.charAt(pr) == '+') {
            pr++;
        } else if (str.charAt(pr) == '-') {
            f=false;
            pr++;
        }

        int retInt = 0;
        for (int i = pr; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
            {
                return 0;
            }
            retInt =retInt*10+str.charAt(i)-48 ;
        }
        return f?retInt:-retInt;
    }
}
