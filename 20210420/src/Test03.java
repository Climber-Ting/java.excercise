import java.util.*;


public class Test03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        while(count<n){
            map.put(count,count);
        }
        int start=-1;
        int temp=0;
        while(n>=1) {

            for (int i = start; i < n; i+=3) {
                temp=i+3;
                map.remove(temp,temp);
                n--;
            }
        }
    }
}
