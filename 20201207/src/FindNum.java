import java.util.*;
/*
    找出出现一次的数字
    作业内容
    有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     */
public class FindNum {
    public static void main(String[] args) {
        int[] arr={2,3,3,2,4,5,1,4,5,6,6};
        int[] cpy=new int[11];
        for(int i=0;i<arr.length;i++){
            cpy[i]=arr[i];    //依次将待查找的数字复制到新的数组
            for(int j=0;j<=i-1;j++){   //每次复制进去新的数字后，遍历之前的数字是否和这次新复制的相等
               if(arr[i]==cpy[j]){   //如果相等
                   cpy[j]=0;     //之前的数字置0
                   cpy[i]=0;       //新复制的数字也置0
               }
            }
        }
        for(int i=0;i<cpy.length;i++) {
            if(cpy[i]!=0){                       //输出复制的数组中不为0的数字，就是有一个 ，即待查找的数字
                System.out.print(cpy[i]+" ");
            }
        }
    }
}
