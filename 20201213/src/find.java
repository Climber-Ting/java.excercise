import java.util.*;
/*
    查找数组中指定元素（顺序查找）
 */
public class find {
    public static int find(int[] arr,int dest) {
        int ret=-1;
        for(int i=0;i<arr.length;i++){
            if(dest==arr[i]){
                ret=i;
                break;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(find(arr,5));
    }
}
