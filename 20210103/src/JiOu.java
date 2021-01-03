import java.util.*;
/*
    奇数放到数组后面

    作业内容
    给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
 */
public class JiOu {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6};
        int left=0;
        int right=a.length-1;
        while(left<right){
            if(left%2==0){
                left++;
            }
            else if(right%2!=0){
                right--;
            }
            else if(left%2!=0&&right%2==0){
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
                right--;
                left++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
