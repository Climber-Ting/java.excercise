import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
//判断一个二叉树是不是完全二叉树
public class IsCompleteTree {
    boolean isCompleteTree(TreeNode root){
        if(root==null)
            return true;
        Deque<TreeNode> list=new LinkedList<>();
        list.offer(root);
        while(!list.isEmpty()) {
            TreeNode cur = list.poll();
            if (cur != null) {
                list.offer(cur.left);
                list.offer(cur.right);
            } else {
                break;
            }
        }
        while(!list.isEmpty()){
            TreeNode isnull=list.poll();
            if (isnull==null){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
