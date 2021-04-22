import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();   //表示行数
        int y=in.nextInt();    //表示列数
        int ret=countWays(x,y);
        System.out.println(ret);
    }
    public static int countWays(int x, int y) {
        // write code here
        if (x==1||y==1){
            return 1;
        }
        else {
            return countWays(x - 1, y) + countWays(x, y - 1);
        }
    }
}
