import java.util.*;
/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert {
    public  TreeNode prev=null;
    public  TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)
            return null;
        convertChild(pRootOfTree);
        TreeNode head=pRootOfTree;
        while(head.left!=null)
            head=head.left;
        return head;
    }
    public  void convertChild(TreeNode pCur) {
        if(pCur==null)
            return ;
        convertChild(pCur.left);

        pCur.left=prev;
        if (prev!=null){
            prev.right=pCur;
        }
        prev=pCur;
        convertChild(pCur.right);
    }
}
