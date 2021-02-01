import java.util.*;
/*
    给你两个版本号 version1 和 version2 ，请你比较它们。
    版本号由一个或多个修订号组成，各修订号由一个 '.' 连接。每个修订号由多位数字组成，可能包含前导零。
    每个版本号至少包含一个字符。修订号从左到右编号，下标从0开始，最左边的修订号下标为0 ，下一个修订号下标为1 ,以此类推。
    例如，2.5.33 和 0.1 都是有效的版本号。
    比较版本号时，请按从左到右的顺序依次比较它们的修订号。比较修订号时，只需比较忽略任何前导零后的整数值。
    也就是说，修订号 1 和修订号 001 相等 。如果版本号没有指定某个下标处的修订号，则该修订号视为0 。
    例如，版本 1.0 小于版本 1.1 ，因为它们下标为 0 的修订号相同，而下标为 1 的修订号分别为 0 和 1 ，0 < 1 。
返回规则如下：
    如果 version1 > version2 返回 1，
    如果 version1 < version2 返回 -1，
    除此之外返回 0。
示例 1：
    输入：version1 = "1.01", version2 = "1.001"
    输出：0
    解释：忽略前导零，"01" 和 "001" 都表示相同的整数 "1"
示例 2：
    输入：version1 = "1.0", version2 = "1.0.0"
    输出：0
    解释：version1 没有指定下标为 2 的修订号，即视为 "0"
示例 3：
    输入：version1 = "0.1", version2 = "1.1"
    输出：-1
    解释：version1 中下标为 0 的修订号是 "0"，version2 中下标为 0 的修订号是 "1" 。0 < 1，所以 version1 < version2
示例 4：
    输入：version1 = "1.0.1", version2 = "1"
    输出：1
示例 5：
    输入：version1 = "7.5.2.4", version2 = "7.5.3"
    输出：-1
 */
public class CompareVersion {
    public static void main(String[] args) {
        String v1="7.5.2.4";
        String v2="7.5.3";
//        String[] str2=v2.split("\\.",3);
//        String[] str=v1.split("\\.");
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(str2));
        System.out.println(compareVersion(v1, v2));
    }
    //方法1  执行较快
    public static int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int n1 = nums1.length, n2 = nums2.length;

        // compare versions
        int i1, i2;
        for (int i = 0; i < Math.max(n1, n2); ++i) {
            //当i超过某一数组的长度时，用0来代替比较
            i1 = i < n1 ? Integer.parseInt(nums1[i]) : 0;
            i2 = i < n2 ? Integer.parseInt(nums2[i]) : 0;
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        // the versions are equal
        return 0;
    }
    //方法2  执行较慢
    public static int compareVersion1(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int i=0;
        while(i<v1.length && i<v2.length){
            if (Integer.valueOf(v1[i]).intValue()>Integer.valueOf(v2[i]).intValue()){
                return 1;
            }
            else if(Integer.valueOf(v1[i]).intValue()<Integer.valueOf(v2[i]).intValue()){
                return -1;
            }
            else {
                i++;
            }
        }

        if (i>=v1.length && i>=v2.length){
            return 0;
        }
        else if(i>=v1.length){
            while(i<v2.length){
                if (Integer.valueOf(v2[i]).intValue()>0){
                    return -1;
                }
                i++;
            }
        }
        else if(i>=v2.length){
            while(i<v1.length){
                if (Integer.valueOf(v1[i]).intValue()>0){
                    return 1;
                }
                i++;
            }
        }
        return 0;

    }
}
