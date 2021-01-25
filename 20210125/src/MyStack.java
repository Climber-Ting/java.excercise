import java.util.*;
/*
使用队列实现栈的下列操作：
push(x) -- 元素 x 入栈
pop() -- 移除栈顶元素
top() -- 获取栈顶元素
empty() -- 返回栈是否为空
注意:
你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。

 */
class MyStack {

    private Queue<Integer> qu1 = new LinkedList<>();

    private Queue<Integer> qu2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        //谁不为空入到哪个队列当中
        if(qu1.isEmpty()){
            qu1.add(x);
        }
        else if(qu2.isEmpty()){
            qu2.add(x);
        }else{
            qu1.offer(x);
        }
    }

    public int pop() {
        if(empty()){
            return -1;
        }
        //每次出不为空的队列，出size-1个 到另外一个为空的队列，最后弹出剩余的那一个元素
        if(!qu1.isEmpty()&&qu2.isEmpty()){
            int size=qu1.size();
            for(int i=0;i<size-1;i++){
                qu2.offer(qu1.poll());
            }
            return qu1.poll();
        }
        else {
            int size=qu2.size();
            for(int i=0;i<size-1;i++){
                qu1.offer(qu2.poll());
            }
            return qu2.poll();
        }
    }

    public int top() {
        if(empty()){
            return -1;
        }
        //每次出不为空的队列，出size-1个 到另外一个为空的队列，最后弹出剩余的那一个元素
        if(!qu1.isEmpty()&&qu2.isEmpty()){
            int size=qu1.size();
            int cur=-1;
            for(int i=0;i<size-1;i++){
                cur=qu1.poll();
                qu2.offer(cur);
            }
            return cur;
        }
        else {
            int size=qu2.size();
            int cur=-1;
            for(int i=0;i<size-1;i++){
                cur=qu2.poll();
                qu1.offer(cur);
            }
            return cur;
        }
    }

    public boolean empty() {
        return qu1.isEmpty()&&qu2.isEmpty();
    }
}






