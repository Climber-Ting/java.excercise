import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int ret=0;
        int n1=0;
        int n2=1;
        int n=n1+n2;
        while (true){
            n=n1+n2;
            if (a<=n&&a>=n2){
                ret=n-a<a-n2?n-a:a-n2;
                break;
            }
            n1=n2;
            n2=n;
        }
        System.out.println(ret);
    }
}
