import java.util.*;

class Cat{
    public static void sleep(){

    }
}
class Solution {
    /*
    给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
    进阶：
    尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
    你可以使用空间复杂度为O(1)的原地算法解决这个问题吗？
     */
    public void rotate(int[] nums, int k) {
        int start=nums.length-k;
        int num1[]=new int[nums.length];
        int a=start;
        int b=0;
        for(int i=0;i<nums.length;i++) {
            if(i<k){
                num1[i] = nums[a];
                a++;
            }
            else{
                num1[i]=nums[b];
                b++;
            }
        }
        System.out.println(Arrays.toString(num1));
    }
    /*
    实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，
    并将该字符串中的大写字母转换成小写字母，
    之后返回新的字符串 。
     */
    //优化后
    public String toLowerCase(String str) {
        if(str==null){
            return null;
        }
        char[] c=str.toCharArray();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                c[i]+=32;
            }
        }
        return String.valueOf(c);
    }
    //优化前
//    public String toLowerCase(String str) {
//        char[] c=new char[str.length()];
//        for (int i=0;i<str.length();i++){
//            if((int)str.charAt(i)>=65&&(int)str.charAt(i)<97){
//                c[i]=(char)((int)str.charAt(i)-65+97);
//            }
//            else{
//                c[i]=str.charAt(i);
//            }
//        }
//        String s="";
//        for(int i=0;i<str.length();i++){
//            s+=c[i];
//        }
//        return s;
//    }
}
public class Test {
    public static void mystery (int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
    public static void main(String[] args) {
        int x=20;
        int y=5;
        System.out.println(x+y+""+(x+y)+y);
        Cat cat=new Cat();
        cat.sleep();
        Cat.sleep();
        mystery(1234);
        System.out.println();
        //========================================
        char a='A';
        char b='a';
        System.out.println((int)a+" "+(int)b);
        Solution solu=new Solution();
        String s=solu.toLowerCase("HeLLo");
        System.out.println(s);
        int[] num={-99,3,4,5,1};
        int k=3;
        solu.rotate(num,k);
    }
}
