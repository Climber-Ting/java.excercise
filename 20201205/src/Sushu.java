import java.util.*;
/*
    打印素数
    作业内容
    打印 1 - 100 之间所有的素数
 */
public class Sushu {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            for(int j=2;j<=i;j++){
                if(j==i){
                    System.out.print(i+" ");
                }
                if(i%j==0){
                    break;
                }
            }
        }
    }
}
