import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1=0;
        int a2=1;
        int a0=a1+a2;
        int a3=a1+a2;
        while(n>a3){
            a0=a1+a2;
            a1=a2;
            a2=a0;
            a3=a1+a2;
        }
        if (n==a3){
            System.out.println(0);
        }
        else if (n>a0&&n<a3){
            int x=n-a0;
            int y=a3-n;
            int ret=x>y?y:x;
            System.out.println(ret);
        }
    }
}
