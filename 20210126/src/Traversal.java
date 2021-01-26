import java.util.*;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Traversal {
     //前序遍历  此方法 相当于子问题求解  根节点add左子树add右子数
     public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();   //如果定义全局变量，则不需要addAll()
         if(root==null)
            return null;
         list.add(root.val);
         list.addAll(preorderTraversal(root.left));
         list.addAll(preorderTraversal(root.right));
         return list;
     }
    //前序遍历  此方法  碰到结点就add
    List<Integer> list=new ArrayList<>();   //定义全局变量，则不需要addAll()
    public List<Integer> preorderTraversal1(TreeNode root) {
        if(root==null)
            return null;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
     //中序遍历
     public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();
         if(root!=null){
            list.addAll(inorderTraversal(root.left));
            list.add(root.val);

            list.addAll(inorderTraversal(root.right));
         }
         return list;
     }
    //后序遍历
     public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();
         if(root!=null){
            list.addAll(postorderTraversal(root.left));
            list.addAll(postorderTraversal(root.right));
            list.add(root.val);
         }
         return list;
     }
}
