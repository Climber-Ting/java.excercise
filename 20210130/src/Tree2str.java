import java.util.*;
/*
    你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
    空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
示例 1:
    输入: 二叉树: [1,2,3,4]
           1
         /   \
        2     3
       /
      4
    输出: "1(2(4))(3)"
    解释: 原本将是“1(2(4)())(3())”，在你省略所有不必要的空括号对之后，它将是“1(2(4))(3)”。
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Tree2str {
    public static String tree2str(TreeNode t) {
        StringBuilder ret=new StringBuilder();
        if(t==null)
            return ret.toString();
        ret.append(t.val);
        TreeNode left=t.left;
        TreeNode right=t.right;
        if(left!=null){
            ret.append('(');
            ret.append(tree2str(t.left));
            ret.append(')');
        }else{
            if(right!=null){
                ret.append('(');
                ret.append(')');
            }
        }
        if(right!=null){
            ret.append('(');
            ret.append(tree2str(t.right));
            ret.append(')');
        }
        return ret.toString();
    }
}
