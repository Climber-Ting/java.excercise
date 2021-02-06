import java.util.*;
/*
    给定字符串J代表石头中宝石的类型，和字符串S代表你拥有的石头。
    S中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
    J中的字母不重复，J和S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
示例 1:
    输入: J = "aA", S = "aAAbbbb"
    输出: 3
示例 2:
    输入: J = "z", S = "ZZ"
    输出: 0
 */
public class NumJewelsInStones {
    //普通算法
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i=0;i<stones.length();i++){
            if (jewels.contains(stones.charAt(i)+"")){
                count++;
            }
        }
        return count;
    }
    //集合算法
    public int numJewelsInStones1(String jewels, String stones) {
        int jewelsCount = 0;
        Set<Character> jewelsSet = new HashSet<Character>();
        int jewelsLength = jewels.length(), stonesLength = stones.length();
        for (int i = 0; i < jewelsLength; i++) {
            char jewel = jewels.charAt(i);
            jewelsSet.add(jewel);
        }
        for (int i = 0; i < stonesLength; i++) {
            char stone = stones.charAt(i);
            if (jewelsSet.contains(stone)) {
                jewelsCount++;
            }
        }
        return jewelsCount;
    }
}
