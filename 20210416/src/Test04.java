
import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        if (n==0){
            System.out.println(0);
            return;
        }
        int sum=arr[0];
        int max=arr[0];
        for (int i=0;i<n;i++){
            if (sum<0){
                sum=arr[i];
            }
            else {
                sum += arr[i];
            }
            if (sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
