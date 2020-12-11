import java.util.*;
/*
    打印数组
    作业内容
    实现一个方法 printArray, 以数组为参数,
    循环访问数组中的每个元素, 打印每个元素的值.
 */
public class PrinftArr {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        printArray(arr);
    }
}
