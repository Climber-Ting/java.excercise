import java.util.*;
/*
给定一个二叉树，检查它是否是镜像对称的。
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        if(isSameTree(root.left,root.right)==false)
            return false;
        return true;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        //判断对称的关键
        //判断 左子树的左子树 和 右子树的右子树 是否相等
        if (isSameTree(p.left, q.right) == false)
            return false;
        //判断 左子树的右子数 和 右子树的左子树 是否相等
        if (isSameTree(p.right, q.left) == false)
            return false;
        return true;
    }
}
