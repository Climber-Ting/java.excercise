import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set1.add(arr[i])){
                set2.add(arr[i]);
            }
            else {
                set2.remove(arr[i]);
            }
        }
        int[] ret=new int[set2.size()];
        int sta=0;
        Iterator<Integer> it=set2.iterator();
        while(it.hasNext()){
            ret[sta++]=it.next();
        }
        Arrays.sort(ret);
        for (int i=0;i<ret.length;i++){
            System.out.print(ret[i]+" ");
        }

    }
}
