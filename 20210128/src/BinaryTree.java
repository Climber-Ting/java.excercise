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
    }
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
    }

}
