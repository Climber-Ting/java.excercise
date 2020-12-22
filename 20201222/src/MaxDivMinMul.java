import java.util.*;
public class MaxDivMinMul {
    public static int maxDivisor(int a, int b) {
        int ret = 1;
        if(a%b==0){
            return b;
        }
        while (a%b!=0){
            ret=a%b;
            a=b;
            b=ret;
        }
        return ret;
    }

    public static long minMultiple(long a, long b) {
        long ret = 1;
        if (a % b == 0) {
            return a;
        } else if (b % a == 0) {
            return b;
        }
////        方法1    运行较慢
//        long i = 1;
//        while ((a*i) % b != 0) {
//            i++;
//        }
//        ret=a*i;

//        // 方法2   运行较快,推荐使用
//        long mul = a * b;
//        while (a % b != 0) {
//            ret = a % b;
//            a = b;
//            b = ret;
//        }
//        ret = mul / ret;

        //方法3
        for(int i=2;i<=a;i++)
        {
            if(a%i==0&&b%i==0)
            {
                a/=i;
                b/=i;
                ret*=i;
            }
        }
        ret*=a;
        ret*=b;

        return ret;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        long ret1 = minMultiple(n, m);
        int ret2 = maxDivisor(n, m);
        long ret=ret1+ret2;
        System.out.println(ret);
    }
}

