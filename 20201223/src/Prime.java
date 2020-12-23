import java.util.*;
public class Prime{
    public static void main(String[] args){
        int count=0;
        for(int i=100;i<=999;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
        }
        count=900-count;
        System.out.println(count);
    }
}
