
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-02-03
 * Time: 11:26
 */


public class BinarySearchTree {

    static class BSNode {
        public int val;
        public BSNode left;
        public BSNode right;
        public BSNode(int val) {
            this.val = val;
        }
    }
    public BSNode root = null;

    public BSNode search(int val) {
        if(root == null) return null;
        BSNode cur = root;
        while(cur!=null){
            if (cur.left.val>val){
                cur=cur.left;
            }
            else if (cur.right.val<val){
                cur=cur.right;
            }
            else{
                return cur;
            }
        }
        return null;
    }

    public boolean insert(int val) {
        BSNode bsNode = new BSNode(val);
        if(root == null) {
            root = bsNode;
            return true;
        }
        BSNode cur = root;
        BSNode parent = null;
        while(cur!=null){
            if (cur.val>val ){
                parent=cur;
                cur=cur.left;

            }
            else if (cur.val<val ){
                parent=cur;
                cur=cur.right;

            }
            else {
                return false;
            }
        }
        if (parent.left==null) {
            parent.left = bsNode;
            return true;
        }
        else {
            parent.right = bsNode;
            return true;
        }
    }

    public void remove(int val) {

    }
}
