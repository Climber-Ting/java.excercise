import java.util.*;
/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */

//二叉搜索树是指在前序遍历的情况下，结点的值是有序递增的
//即对每棵子树来说，左孩子的值小于根节点的值，根节点的值小于右孩子的值

public class Convert {
    public  TreeNode Convert(TreeNode pRootOfTree) {
        ConvertChild(pRootOfTree);
        TreeNode head=pRootOfTree;
        while(head.left!=null)
            head=head.left;
        return head;
    }
    TreeNode pre=null;
    public  void ConvertChild(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return;
        }
        TreeNode cur=pRootOfTree;
        ConvertChild(cur.left);
        cur.left=pre;
        if (pre!=null){
            pre.right=cur;
        }
        pre=cur;
        ConvertChild(cur.right);
    }
}

