import java.util.*;
/*
    每个人都想成为大V (VIP：Very Important Person)，但要一点一点积累才行，
    先从小v做起。要求输出由小写字母v组成的大V。
    输入描述:
    无
    输出描述:
    v   v
     v v
      v
 */
public class test{
    public static void main(String[] args){
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                if(i==j||i+j==4){
                    System.out.print("v");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

