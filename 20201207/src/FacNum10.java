import java.util.*;
/*
    递归求和
    作业内容
    递归求 1 + 2 + 3 + ... + 10
 */
public class FacNum10 {
    public static int sum10(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n+sum10(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum10(10));
    }
}
