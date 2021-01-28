import java.util.*;
/*
    给定一个二叉树，确定它是否是一个完全二叉树。
    百度百科中对完全二叉树的定义如下：
    若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，
    第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。
    （注：第 h 层可能包含 1~ 2h 个节点。）
 */
public class IsCompleteTree1 {
    public boolean isCompleteTree(TreeNode root) {
        Deque<TreeNode> de=new LinkedList<>();
        de.offer(root);
        while(!de.isEmpty()){
            TreeNode cur=de.poll();
            if (cur==null){
                break;
            }else{
                de.offer(cur.left);
                de.offer(cur.right);
            }
        }
        while(!de.isEmpty()){
            if(de.poll()!=null){
                return false;
            }
        }
        return true;
    }
}
