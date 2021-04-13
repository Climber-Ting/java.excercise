import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=n*3;
        int[] arr=new int[count];
        for (int i=0;i<count;i++){
            arr[i]=in.nextInt();
        }
        //冒泡排序
        boolean flag=true;
        for (int i=0;i<count-1;i++){
            for (int j=0;j<count-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }else {
                    continue;
                }
            }
            if (flag){
                break;
            }
        }
        int ret=0;
        int start=count-2;
        while (n>0){
            ret+=arr[start];
            n--;
            start-=2;
        }
        System.out.println(ret);
    }
}
