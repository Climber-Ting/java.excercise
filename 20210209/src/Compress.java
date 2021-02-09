import java.util.*;
/*
    给定一组字符，使用原地算法将其压缩。压缩后的长度必须始终小于或等于原数组长度。
    数组的每个元素应该是长度为1的字符（不是int整数类型）。在完成原地修改输入数组后，返回数组的新长度。
进阶：你能否仅使用O(1) 空间解决问题？
示例 1：
    输入：["a","a","b","b","c","c","c"]
    输出：返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
    说明："aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
示例 2：
    输入：["a"]
    输出：返回 1 ，输入数组的前 1 个字符应该是：["a"]
    解释：没有任何字符串被替代。
示例 3：
    输入：["a","b","b","b","b","b","b","b","b","b","b","b","b"]
    输出：返回 4 ，输入数组的前4个字符应该是：["a","b","1","2"]。
    解释：由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被“b12”替代。注意每个数字在数组中都有它自己的位置。
 */
public class Compress {
    public static void main(String[] args) {
        char[] s={'a','a','a','b','b','a','a'};
        System.out.println(compress1(s));
        System.out.println(Arrays.toString(s));
    }
    public static int compress1(char[] chars) {
        int key=0;
        //key表示重新给数组赋值的下标
        for (int i=0;i<chars.length;){
            char ch=chars[i];
            int count=1;
            //count代表每个不同字母的数量
            while(i<chars.length-1&&chars[i]==chars[i+1]){
                count++;
                i++;
            }
            //如果字母不止一个，则进行下列的重新赋值操作
            if (count>1){
                chars[key++]=ch;
                while(count>9){
                    chars[key++]=(char)(count/10+'0');
                    count%=10;
                }
                chars[key++]=(char)(count+'0');
            }
            else {
                chars[key++]=ch;
            }
            i++;
        }
        return key;
    }
    public static int compress(char[] chars) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Integer,Character> p=new HashMap<>();
        int key=0;
        for (int i=0;i<chars.length;){
            char ch=chars[i];
            int count=1;
            while(i<chars.length-1&&chars[i]==chars[i+1]){
                count++;
                i++;
            }
            p.put(key++,ch);
            map.put(ch,count);
            i++;
        }
        int i=0;
        int ret=0;
        int k=0;
        while(!p.isEmpty()){
            ret++;
            chars[i++]=p.get(k);
            int temp=map.get(p.get(k));
            if (temp>1){
                while(temp>9){
                    chars[i++]=(char)(temp/10+'0');
                    temp%=10;
                    ret++;
                }
                chars[i++]=(char)(temp+'0');
                ret++;
            }
            p.remove(k++);
        }
        return ret;
    }
}
