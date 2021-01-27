/*
给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

 */
public class IsSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null)
            return true;
        if(s==null)
            return false;
        if (isSameTree(s,t))
            return true;
        if(isSubtree(s.left,t))
            return true;
        if (isSubtree(s.right,t))
            return true;
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        if (isSameTree(p.left, q.left) == false)
            return false;
        if (isSameTree(p.right, q.right) == false)
            return false;
        return true;
    }
}
