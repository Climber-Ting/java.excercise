import java.util.*;
/*
    给一个字符类型的数组chas和一个整数size，
    请把大小为size的左半区整体右移到右半区，右半区整体移动到左边。
 */
public  class ReverseChar {
    //反转函数
    public static String reverseK(String str,int left,int right) {
        char[] chars=str.toCharArray();
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String str = scan.next();

        String ret = reverseK(str,0,k-1);
        String ret1= reverseK(ret,k,str.length()-1);
        String ret2= reverseK(ret1,0,str.length()-1);
        System.out.println(ret2);
    }
}

