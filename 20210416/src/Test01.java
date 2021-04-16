import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        int n4=in.nextInt();
        int a=0,b=0,c=0;
        boolean f=true;
        if (n3<0||n4<0||(n1+n3)<0||(n2+n4)<0){
            System.out.println("No");
            return;
        }
        if ((n1+n3)%2==0){
            a=(n1+n3)/2;
        }
        else {
            f=false;
        }
        if ((n2+n4)%2==0){
           b=(n2+n4)/2;
        }
        else {
            f=false;
        }
        if (n4-b<0){
            f=false;
        }
        else {
            c = n4 - b;
        }

        if (f) {
            System.out.println(a + " " + b + " " + c);
        }
        else {
            System.out.println("No");
        }
    }
}
