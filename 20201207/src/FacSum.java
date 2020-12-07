import java.util.*;
/*
    求阶乘和
    作业内容
    求1！+2！+3！+4！+........+n!的和
 */
public class FacSum {
    public static int fac(int n) {
        int fac=1;
        for(int j=1;j<=n;j++){
            fac*=j;
        }
        return fac;
    }
    public static int facSum(int n) {
        int sum=0;
        int fac=0;
        for(int j=1;j<=n;j++){
            fac=fac(j);
            sum+=fac;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ret=facSum(n);
        System.out.println(ret);
    }
}
