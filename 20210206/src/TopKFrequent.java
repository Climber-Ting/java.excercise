import java.util.*;
/*
    给一非空的单词列表，返回前k个出现次数最多的单词。
    返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
示例 1：
    输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
    输出: ["i", "love"]
    解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。注意，按字母顺序 "i" 在 "love" 之前。
示例 2：
    输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
    输出: ["the", "is", "sunny", "day"]
    解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，出现次数依次为 4, 3, 2 和 1 次。
 */
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for (int i=0;i<words.length;i++){
            int count=map.getOrDefault(words[i],0);
            map.put(words[i],count+1);
        }
        List<String> list=new ArrayList<>(map.keySet());

//        Collections.sort(list, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
//                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (map.get(o1).equals(map.get(o2))){
                    return o1.compareTo(o2);
                }
                int a1=map.get(o1);
                int a2=map.get(o2);
                return a2-a1;
            }
        });
        return list.subList(0,k);
    }
}
