import java.util.*;
public class Num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        int count=0;  //表示数字串的数量
        StringBuilder[] obj=new StringBuilder[str.length()];   //字符串数组来存放每个数字串
        for (int i=0;i<ch.length;i++){
            if (ch[i]>=48&&ch[i]<=57){
                StringBuilder numStr=new StringBuilder();
                numStr.append(ch[i]);
                while(i<ch.length-1 &&ch[i+1]>=48 &&ch[i+1]<=57){
                    numStr.append(ch[i+1]);
                    i++;
                }
                obj[count]=numStr;      //依次把每个数字串存放到字符串数组中
                count++;
            }
        }
        int maxLen=0;
        int pr=0;    //pr表示最长的数字串的下标
        for(int i=0;i<obj.length;i++){
            if (obj[i]!=null&&obj[i].length()>=1){
                if (obj[i].length()>maxLen){
                    maxLen=obj[i].length();
                    pr=i;
                }
                else {
                    continue;
                }
            }
            else {
                break;
            }
        }
        System.out.println(obj[pr].toString());
    }
}
