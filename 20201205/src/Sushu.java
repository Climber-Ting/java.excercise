import java.util.*;
/*
    打印素数
    作业内容
    打印 1 - 100 之间所有的素数
 */
public class Sushu {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            int j=2;
            for(;j<=Math.sqrt(i);j++){

                if(i%j==0){
                    break;
                }
            }
            if(j>Math.sqrt(i)){
                System.out.print(i+" ");
            }
        }
    }
}
