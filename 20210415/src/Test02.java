import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class Test02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,2,2,2,1};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<len;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        Iterator<Integer> it=map.keySet().iterator();
        int ret=0;
        while (it.hasNext()){
            Integer key=it.next();
            if (map.get(key)>len/2){
               ret=key;
               break;
            }
            else {
                ret=0;
            }
        }
        return  ret;
    }
}
