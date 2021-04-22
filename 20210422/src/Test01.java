import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        long f=func(a);
        int count=0;
        while(f!=0){
            if (f%10==0){
                count++;
            }
            else {
                break;
            }
            f/=10;
        }
        System.out.println(count);
    }

    public static long func(int a) {
        long ret=1;
        for (int i=1;i<=a;i++){
            ret*=i;
        }
        return ret;
    }
}
