import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        while(sc.hasNext()){
                String str=sc.nextLine();
                String[] strs=str.split(" ");
                for (int i=0;i<strs.length;i++){
                    set.add(strs[i]);
                }
        }
        System.out.println(set.size());
    }
}
