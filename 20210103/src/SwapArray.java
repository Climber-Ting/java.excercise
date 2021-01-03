import java.util.*;
/*
    交换两个数组

    作业内容
    给定两个整型数组, 交换两个数组的内容.
 */
public class SwapArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i=0;i<a.length;i++){
            int tmp=a[i];
            a[i]=b[i];
            b[i]=tmp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
