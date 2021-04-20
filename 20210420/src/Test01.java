import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            int temp=arr[i];
            int j;
            for (j=i;j>=0;j--){
                if (arr[j]<temp){
                    System.out.print(j+" ");
                    break;
                }
            }
            if (j<0) {
                System.out.print(-1 + " ");
            }
            for (j=i;j<n;j++){
                if (arr[j]<temp){
                    System.out.println(j);
                    break;
                }
            }
            if (j>=n) {
                System.out.println(-1);
            }
        }
    }
}
