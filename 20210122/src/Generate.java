import java.util.*;
/*
    给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
    在杨辉三角中，每个数是它左上方和右上方的数的和。
示例:
    输入: 5
    输出:
    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows <= 0) return ret;

        //第一行的list
        List<Integer> list = new ArrayList<>();
        list.add(1);

        //把第一行的list放到ret当中
        ret.add(list);

        for(int i = 1;i < numRows;i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j = 1 ;j < i;j++) {
                //确定的是当前行的每个元素  ==  上一行的当前列+上一行的前一列就是我当前需要添加的数字
                int m=ret.get(i-1).get(j-1) + ret.get(i-1).get(j);
                curRow.add(m);
            }
            //手动在当前行的最后一个位置 添加一个1
            curRow.add(1);

            ret.add(curRow);
        }
        return ret;
    }
}
