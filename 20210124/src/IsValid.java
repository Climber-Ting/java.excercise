import java.util.*;
/*
    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串。
示例 1:
    输入: "()"
    输出: true
示例 2:
    输入: "()[]{}"
    输出: true
 */
public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                //说明当前遍历到的字符是左括号
                stack.push(ch);
            }else {
                //1、判断当前的栈是否是空的
                if(stack.empty()) {
                    System.out.println("右括号多");
                    return false;//代表右括号多
                }
                //2、拿到栈顶元素，看栈顶元素是否和当前的字符匹配，如果匹配当前栈顶元素出栈
                char topch = stack.peek();
                if(topch == '{' && ch == '}' || topch == '[' && ch == ']' || topch == '(' && ch == ')') {
                    stack.pop();
                }else{
                    System.out.println("左右括号不匹配");
                    return false;//代表左右括号不匹配
                }
            }
        }
        if(!stack.empty()) {
            System.out.println("左括号多");
            return false;//代表左括号多
        }
        return true;
    }
}

