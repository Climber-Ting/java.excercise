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
public class BuildTree {
    public int preIndex=0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,int inbegin,int inend) {
        //说明没有子树
        if (inbegin>inend)
            return null;
        TreeNode root=new TreeNode(preorder[preIndex]);
        //在中序遍历的数组当中找到当前根节点所在的位置
        int index = findValueInorder(inorder,preorder[preIndex],inbegin,inend);
        preIndex++;
        root.left=buildTreeChild(preorder,inorder,inbegin,index-1);
        root.right=buildTreeChild(preorder,inorder,index+1,inend);
        return root;
    }

    public int findValueInorder(int[] inorder,int key,int inbegin,int inend){
        for(int i=inbegin;i<=inend;i++){
            if(inorder[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||inorder==null)
            return null;
        if (preorder.length==0||inorder.length==0)
            return null;
        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}
