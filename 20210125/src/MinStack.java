import java.util.Stack;
/*
设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
push(x) —— 将元素 x 推入栈中。
pop() —— 删除栈顶的元素。
top() —— 获取栈顶元素。
getMin() —— 检索栈中的最小元素。
 */
public class MinStack {
    Stack<Integer> stack=new Stack<>();//存放
    Stack<Integer> minStack=new Stack<>(); //存放最小值
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        }
        else {
            if(x<=minStack.peek()) {
                minStack.push(x);
            }
        }

    }

    public void pop() {
        //if(minStack.peek().equals(stack.peek()))   这样比较更严谨  比较引用类型的值，用equals
        if(minStack.peek().intValue()==stack.peek().intValue()) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
