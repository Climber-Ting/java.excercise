import java.util.*;
/*
    输出闰年
    作业内容
    输出 1000 - 2000 之间所有的闰年
     */
public class Year {
    public static void main(String[] args) {
        for(int i=1000;i<=2000;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.print(i+" ");
            }
        }
    }
}
