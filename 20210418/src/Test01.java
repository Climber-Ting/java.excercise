import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int w=in.nextInt();     //表示列
        int h=in.nextInt();     //表示行
        boolean[][] arr=new boolean[h][w];
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                arr[i][j]=true;
            }
        }
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (arr[i][j]){
                    if (i+2<h){
                        arr[i+2][j]=false;
                    }
                    if (j+2<w){
                        arr[i][j+2]=false;
                    }
                }
            }
        }
        int count=0;
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

