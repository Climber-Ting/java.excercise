import java.util.*;
/*
    二进制序列
    作业内容
    获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
 */

public class BitPrint {
    static void Printbit(int num)
    {
        for (int i = 31; i >= 1; i -= 2)
        {
            int a=(num >> i) & 1;
            System.out.print(a+" ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i -= 2)
        {
            int a=(num >> i) & 1;
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

            int a = 32;
            Printbit(a);
    }
}
