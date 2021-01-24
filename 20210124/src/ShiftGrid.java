import java.util.*;
/*
    给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
    每次「迁移」操作将会引发下述活动：
    位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
    位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
    位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
    请你返回 k 次迁移操作后最终得到的 二维网格。

    输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
    输出：[[9,1,2],[3,4,5],[6,7,8]]
 */
public class ShiftGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<Integer> list=new ArrayList<>();
//将数组中的值添加到链表中
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
        }
        if(k>=list.size()){
            k=k%list.size();
            if(k!=0){
                //截取倒数k个子串，再将前k个删掉，替换成后k个
                List<Integer> sub= list.subList(list.size()-k,list.size());
                list.remove(sub);
                list.addAll(0,sub);
            }
        }else {
            List<Integer> sub= list.subList(list.size()-k,list.size());
            list.remove(sub);
            list.addAll(0,sub);
        }
//建一个二维链表
        List<List<Integer>> l=new ArrayList<>();
//依次将值添加到二维链表中
        for(int i=0;i<grid.length;i++){
            List<Integer> m=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                Integer in=list.remove(0);
                m.add(in);
            }
            l.add(m);
        }
        return l;

    }

    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(shiftGrid(a, 1));
    }

}
