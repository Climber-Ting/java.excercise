import java.util.*;
/*
给定一个二叉树，判断它是否是高度平衡的二叉树。
本题中，一棵高度平衡二叉树定义为：
一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class IsBalanced {
    public int hight(TreeNode root) {
        if(root == null) return 0;
        int leftHight = hight(root.left);
        int rightHight = hight(root.right);
        // if(leftHight >= 0 && rightHight >= 0 &&
        // Math.abs(leftHight-rightHight) <= 1) {
        //     return Math.max(leftHight,rightHight) + 1;
        // }else {
        //     return -1;
        // }
        if(leftHight == -1 || rightHight == -1 ||
                Math.abs(leftHight-rightHight) > 1) {
            return -1;
        }else {
            return Math.max(leftHight,rightHight) + 1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if(hight(root) >= 0) {
            return true;
        }
        return false;
        //return hight(root) >= 0;
    }

}
