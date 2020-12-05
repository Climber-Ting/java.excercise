import java.util.*;
/*
    输出乘法口诀表
    作业内容
    输出n*n的乘法口诀表，n由用户输入。
 */
public class Printf99 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int res=i*j;
                System.out.print(j+"×"+i+"="+res+" ");
            }
            System.out.println();
        }
    }
}
