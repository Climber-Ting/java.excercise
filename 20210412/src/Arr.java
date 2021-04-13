import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count=0;
        for (int j=0;j<=n-1;) {
            if (j==n-1){
                count++;
                break;
            }
            if (arr[j] <arr[j + 1]){
                while(arr[j] < arr[j + 1]) {
                    j++;
                    if (j>=n-1){
                        break;
                    }
                }
            }
            else if (arr[j]>=arr[j+1]) {
                while (arr[j] >= arr[j + 1]) {
                    j++;
                    if (j >=n - 1) {
                        break;
                    }
                }
            }
            count++;
            j++;
        }
        System.out.println(count);
    }
}
