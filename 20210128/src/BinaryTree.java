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
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BTNode root=binaryTree.createTree();
        binaryTree.inOrderTraversal(root);
        binaryTree.preOrderTraversal(root);
        binaryTree.postOrderTraversal(root);
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
    //非递归前序遍历
    void preOrderTraversal(BTNode root) {
        if(root==null) return;
        Stack<BTNode> stack=new Stack<>();
        BTNode cur=root;
        //一开始栈里没有元素，只把cur指向了root，因此循环条件里加||cur!=null
        while(!stack.empty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                System.out.print(cur.val+" ");
                cur=cur.left;
            }
            BTNode top=stack.pop();
            cur=top.right;
        }
        System.out.println();
    }
    //非递归中序遍历
    void inOrderTraversal(BTNode root) {
        if(root==null) return;
        Stack<BTNode> stack=new Stack<>();
        BTNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            BTNode top=stack.pop();
            System.out.print(top.val+" ");
            cur=top.right;
        }
        System.out.println();
    }
    //非递归后序遍历
    void postOrderTraversal(BTNode root) {
        if(root==null) return;
        Stack<BTNode> stack=new Stack<>();
        BTNode prev=null;
        BTNode cur=root;
        while(cur!=null||!stack.isEmpty()){

            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            BTNode top=stack.peek();
            if (top.right==null || prev==top.right){
                stack.pop();
                System.out.print(top.val+" ");
                prev=top;
            }
            else{
                cur=top.right;
            }
        }
        System.out.println();
    }

}
