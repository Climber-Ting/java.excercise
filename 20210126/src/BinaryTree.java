import java.util.*;

class BTNode {
    public char val;
    public BTNode left;//左子树的引用
    public BTNode right;//右子树的引用

    public BTNode(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    /**
     * 我们要首先创建二叉树，但是为了好理解，我们先以穷举的方式
     * 创建二叉树
     * 后期我们会以遍历的方式 创建二叉树
     * 当前只是权宜之计
     * @return
     */

    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree();
        BTNode root=binaryTree.createTree();

        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        binaryTree.getSize1(root);
        System.out.println(size);

        System.out.println(binaryTree.getSize2(root));

        binaryTree.getLeafSize1(root);
        System.out.println(leafSize);

        System.out.println(binaryTree.getLeafSize2(root));

        System.out.println(binaryTree.getKLevelSize(root, 3));
        System.out.println(binaryTree.getHeight(root));

        BTNode ret=binaryTree.find(root,'M');
        if(ret!=null)
            System.out.println(ret.val);
        else
            System.out.println("没找到！");

        binaryTree.levelOrderTraversal(root);
    }
    public BTNode createTree() {
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }


    // 前序遍历
    void preOrderTraversal(BTNode root) {
        if(root == null) return;
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(BTNode root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(BTNode root) {
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }

    // 遍历思路-求结点个数    遇到结点+1
    static int size = 0;
    void getSize1(BTNode root){
        if(root == null) return;
        size++;
        getSize1(root.left);
        getSize1(root.right);

    }

    // 子问题思路-求结点个数    左数结点+右树结点+1
    int getSize2(BTNode root){
        if(root==null)
            return 0;
        return getSize2(root.left)+ getSize2(root.right) +1;
    }

    // 遍历思路-求叶子结点个数    遇到叶子结点+1
    static int leafSize = 0;
    void getLeafSize1(BTNode root){
        if(root==null)
            return ;
        if(root.left==null&&root.right==null){
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    // 子问题思路-求叶子结点个数    左数叶子+右树叶子
    int getLeafSize2(BTNode root){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(BTNode root,int k){
        if(root==null)
            return 0;
        if(k==1)
            return 1;
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }

    // 获取二叉树的高度  子问题思路  取左子树和右子数的最大值  然后+1
    int getHeight(BTNode root){
        if(root==null)
            return 0;
        int leftH=getHeight(root.left);
        int rightH=getHeight(root.right);
        int max=leftH > rightH? leftH: rightH;
        return max+1;
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    BTNode find(BTNode root, char val){
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        BTNode left=find(root.left,val);
        if(left!=null&&left.val==val)
            return left;
        BTNode right=find(root.right,val);
        if(right!=null&&right.val==val)
            return right;
        return null;
    }
    public void levelOrderTraversal(BTNode root){
        if(root==null)
            return;
        Deque<BTNode> list=new LinkedList<>();
        list.offer(root);
        while(!list.isEmpty()){
            BTNode node=list.poll();
            System.out.print(node.val+" ");
            if (node.left!=null)
                list.add(node.left);
            if (node.right!=null)
                list.add(node.right);
        }
        System.out.println();
    }
}

