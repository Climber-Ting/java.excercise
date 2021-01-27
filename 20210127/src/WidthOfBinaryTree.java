import java.util.*;
/*
给定一个二叉树，编写一个函数来获取这个树的最大宽度。
树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
 */
public class WidthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(3);
        TreeNode t3=new TreeNode(2);
        TreeNode t4=new TreeNode(5);
        TreeNode t5=new TreeNode(3);
        TreeNode t6=new TreeNode(9);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.right=t6;
        int max = widthOfBinaryTree(t1);
        System.out.println(max);
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if (root==null)
            return 0;
        //建一个二维链表 链表里存放修改后的每层数据
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        Deque<TreeNode> list=new LinkedList<>();
        list.offer(root);
        //思路是将所有的结点值改为 完全二叉树的标号
        //因此先将根节点改为1，后期通过根节点改左右结点
        root.val=1;
        while(!list.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>();
            int len=list.size();
            while(len>0){
                TreeNode cur=list.poll();
                arr.add(cur.val);
                if (cur.left!=null){
                    //修改值为 左节点等于本身的二倍
                    cur.left.val=cur.val*2;
                    list.offer(cur.left);
                }
                if (cur.right!=null){
                    //修改值为 右节点等于本身的二倍+1
                    cur.right.val=cur.val*2+1;
                    list.offer(cur.right);
                }
                len--;
            }
            ret.add(arr);
        }
        int maxLen=0;

        for(int i=0;i<ret.size();i++){
            int tail= ret.get(i).size()-1;
            //判断每个链表的最后一个值与第一个值的差值 就是当前层的宽度
            int gap= ret.get(i).get(tail)-ret.get(i).get(0);
            //保存最大宽度
            if(gap>maxLen)
                maxLen=gap;
        }
        return maxLen+1;
    }
    //求高度
    int getHeight(TreeNode root){
        if(root==null)
            return 0;
        int leftH=getHeight(root.left);
        int rightH=getHeight(root.right);
        int max=leftH > rightH? leftH: rightH;
        return max+1;
    }
    //求第k层结点个数
    int getKLevelSize(TreeNode root,int k){
        if(root==null)
            return 0;
        if(k==1)
            return 1;
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }
}
