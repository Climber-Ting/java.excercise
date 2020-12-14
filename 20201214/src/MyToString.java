import java.util.*;
/*
    数组转字符串
    作业内容
    实现一个方法 toString,
    把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
 */
public class MyToString {
    public static String toString(int[] arr) {
        String s="[";
        for(int i=0;i<arr.length;i++){
           if(i!=arr.length-1){
               s+=arr[i];
               s+=',';
           }
           else{
               s+=arr[i];
           }
        }
        s+=']';
        return s;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(toString(arr));

    }
}
