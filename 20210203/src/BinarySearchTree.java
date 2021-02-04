
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
        if(root == null) return;
        BSNode cur = root;
        BSNode parent = null;
        while (cur != null) {
            if(cur.val == val) {
                removeNode(parent,cur,val);
                return;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    /**
     * 删除二叉搜索树的节点
     * @param parent
     * @param cur
     * @param val
     */
    public void removeNode(BSNode parent,BSNode cur,int val) {
        if(cur.left == null) {
            if (cur==root){
                root=cur.right;
                return;
            }
            else if (cur==parent.left){
                parent.left=cur.right;
                return;
            }
            else {
                parent.right=cur.right;
                return;
            }

        }else if(cur.right == null) {
            if(cur==root){
                root=cur.left;
                return;
            }
            else if (cur==parent.left){
                parent.left=cur.left;
                return;
            }
            else {
                parent.right=cur.left;
                return;
            }
        }else {
            //
            BSNode targetParent = cur;
            BSNode target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            //target指向的节点就是 右边的最小值
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

}
