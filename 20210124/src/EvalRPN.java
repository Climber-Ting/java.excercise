import java.util.*;
/*
    根据 逆波兰表示法，求表达式的值。
    有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
说明：
    整数除法只保留整数部分。
    给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
示例 1：
    输入: ["2", "1", "+", "3", "*"]
    输出: 9
    解释: 该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
示例 2：
    输入: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
    输出: 22
    解释:
    该算式转化为常见的中缀算术表达式为：
      ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
    = ((10 * (6 / (12 * -11))) + 17) + 5
    = ((10 * (6 / -132)) + 17) + 5
    = ((10 * 0) + 17) + 5
    = (0 + 17) + 5
    = 17 + 5
    = 22
 */
public class EvalRPN {
    public static void main(String[] args) {
        String[] s={"4","13","5","/","+"};
        System.out.println(evalRPN(s));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        //Deque<Integer> stk=new ArrayDeque<>();
        for( final String token:tokens){
            if(isNum(token)){
                stk.push(Integer.valueOf(token));
                continue;
            }
            int a=stk.pop();  //第一个弹出的数字作为算术表达式的后操作数
            int b=stk.pop();  //第二个弹出的数字作为前操作数
            switch (token){
                case "+":
                    stk.push(a+b);break;
                case "-":
                    stk.push(a-b);break;
                case "*":
                    stk.push(a*b);break;
                case "/":
                    stk.push(a/b);break;
            }
        }
        return stk.pop();
    }
    public static boolean isNum(String s){
        if(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")){
            return true;
        }else {
            return false;
        }
    }
}
