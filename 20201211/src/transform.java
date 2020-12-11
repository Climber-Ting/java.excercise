import java.util.*;
/*
    改变原有数组元素的值
    作业内容
    实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素乘以 2 ,
    并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 */
public class transform {
    public static int[] transform(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(transform(arr)));
    }
}
