import java.util.*;
/*
    找出出现一次的数字
    作业内容
    有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     */
public class FindNum {
    public static void main(String[] args) {
        int[] arr={2,3,3,2,4,5,1,4,5,6,6};
        int[] cpy={0};
        int flag = 0;
        int tmp=0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;i<arr.length;j++){
               arr[j]=arr[i];
            }
        }
    }
}
