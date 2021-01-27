import java.util.*;
/*
给定一个二叉树，判断它是否是高度平衡的二叉树。
本题中，一棵高度平衡二叉树定义为：
一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */


public class IsBalanced {
    //此方法 时间复杂度是O（n^2）  从上往下
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int left=hight(root.left);
        int right=hight(root.right);
        if(Math.abs(left-right)>1)
            return false;
        if (isBalanced(root.left)==false)
            return false;
        if (isBalanced(root.right)==false)
            return false;
        return true;
    }

    public int hight(TreeNode root) {
        if (root==null)
            return 0;
        int left= hight(root.left);
        int right= hight(root.right);
        int max=left>right?left:right;
        return max+1;
    }


//下边的方法  时间复杂度是O（n）  从下往上
    public boolean isBalanced1(TreeNode root) {
        if(hight1(root) >= 0) {
            return true;
        }
        return false;
        //return hight(root) >= 0;
    }
    public int hight1(TreeNode root) {
        if(root == null) return 0;
        int leftHight = hight1(root.left);
        int rightHight = hight1(root.right);
        // if(leftHight >= 0 && rightHight >= 0 &&
        // Math.abs(leftHight-rightHight) <= 1) {
        //     return Math.max(leftHight,rightHight) + 1;
        // }else {
        //     return -1;
        // }

        //左子树不平衡 或者 右子数不平衡 或者当下不平衡 都会返回-1
        //返回-1 代表不平衡
        //加这一个条件 leftHight == -1 || rightHight == -1，
        //防止两边都不平衡时，取最大值+1后，结果为0 造成平衡的假象
        //这代表 左子树不平衡或者右子数不平衡 都会返回false
        if(leftHight == -1 || rightHight == -1 ||
                Math.abs(leftHight-rightHight) > 1) {
            return -1;
        }else {
            return Math.max(leftHight,rightHight) + 1;
        }
    }
}
