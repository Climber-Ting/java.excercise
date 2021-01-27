import java.util.*;
//层序遍历
public class LevelOrderTraversal {
    public void levelOrderTraversal(TreeNode root){
        if(root==null)
            return;
        Deque<TreeNode> list=new LinkedList<>();
        list.offer(root);
        while(!list.isEmpty()){
            TreeNode node=list.poll();
            System.out.print(node.val+" ");
            if (node.left!=null)
                list.add(node.left);
            if (node.right!=null)
                list.add(node.right);
        }
    }
    /*
    给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
    示例：
    二叉树：[3,9,20,null,null,15,7],
        3
       / \
      9  20
        /  \
       15   7
    返回其层序遍历结果：
    [
      [3],
      [9,20],
      [15,7]
    ]
    */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        //建一个队列 放入结点
        Deque<TreeNode> list = new LinkedList<>();
        list.offer(root);

        while (!list.isEmpty()) {
            //每次放入的结点数量不同，导致list长度不同，这个长度刚好是每一层的节点数
            int len = list.size();
            List<Integer> de = new ArrayList<>();
            //用这个长度来控制放入 子链表的元素
            // 也就是说当前队列里有多少个结点 就把他们的数据都放入子链表里
            //每次都会新建新的链表 ，也就是子链表
            while (len > 0) {
                TreeNode cur = list.poll();
                de.add(cur.val);
                //将下一层的结点放入队列里
                if (cur.left != null)
                    list.offer(cur.left);
                if (cur.right != null)
                    list.offer(cur.right);
                len--;
            }
            //每次循环结束 都将当前的子链表 放入二维链表中
            ret.add(de);
        }
        return ret;
    }
}
