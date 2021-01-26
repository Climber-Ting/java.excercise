import java.util.*;
/*
给你一个树，请你按中序遍历 重新排列树，使树中最左边的结点现在是树的根，
并且每个结点没有左子结点，只有一个右子结点。
 */
public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list=inorder(root);
        TreeNode node=new TreeNode();
        TreeNode cur=node;
        for(int i=0;i<list.size();i++){
            TreeNode n=new TreeNode(list.get(i).val);
            cur.right=n;
            cur=cur.right;
        }
        return node.right;
    }
    public List<TreeNode> inorder(TreeNode root) {
        ArrayList<TreeNode> list=new ArrayList<>();
        if(root!=null){
            list.addAll(inorder(root.left));
            list.add(root);
            list.addAll(inorder(root.right));
        }
        return list;
    }
}
