import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int srcNum=in.nextInt();
        int n=in.nextInt();
        StringBuilder str=new StringBuilder();
        int src=srcNum;
        if (srcNum==0){
            System.out.println(0);
            return;
        }
        else if (srcNum<0){
            srcNum=-srcNum;
        }
        while(srcNum!=0&&n<=9){
            str.append(srcNum%n);
            srcNum/=n;
        }
        while(srcNum!=0&&n>9){
            if (srcNum%n>9) {
                switch (srcNum % n) {
                    case 10:
                        str.append('A');
                        break;
                    case 11:
                        str.append('B');
                        break;
                    case 12:
                        str.append('C');
                        break;
                    case 13:
                        str.append('D');
                        break;
                    case 14:
                        str.append('E');
                        break;
                    case 15:
                        str.append('F');
                        break;

                }
            }
            else {
                str.append(srcNum%n);
            }
            srcNum/=n;
        }

        for (int i=0,j=str.length()-1;i<j;i++,j--){
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
        }

        if (src>0){
            System.out.println(str.toString());
        }
        else {
            System.out.println("-"+str.toString());
        }
    }

}
