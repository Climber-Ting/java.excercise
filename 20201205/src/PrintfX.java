import java.util.*;
/*
                打印 X 图形
                输入
                5
                输出
                *   *
                 * *
                  *
                 * *
                *   *
                 6
                输出
                *    *
                 *  *
                  **
                  **
                 *  *
                *    *
 */

public class PrintfX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int in=input.nextInt();
        for(int i=0;i<in;i++){
            for(int j=in-1;j>=0;j--) {
                if(i+j==in-1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
