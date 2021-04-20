import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int max=a>b?a:b;
        for (int i=max;;i++){
            if (i%a==0&&i%b==0){
                System.out.println(i);
                break;
            }
        }

    }

    public static boolean isPrime(int n) {
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
