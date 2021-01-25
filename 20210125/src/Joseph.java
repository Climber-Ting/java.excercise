import java.util.*;
/*
题目描述
现有n个人围坐一圈，顺时针给大家编号，第一个人编号为1，然后顺时针开始报数。第一轮依次报1，2，1，2...没报1的人出局。
接着第二轮再从上一轮最后一个报数的人开始依次报1，2，3，1，2，3...没报1的人都出局。
以此类推直到剩下以后一个人。现给定一个int n，要求返回最后一个人的编号。
测试样例：
5
返回：5
 */
public class Joseph {
//定义两个链表，依次淘汰，轮流放置
    public static int getResult(int n) {
        LinkedList<Integer> arr=new LinkedList<>();
        LinkedList<Integer> res=new LinkedList<>();
        for(int i=1;i<=n;i++)
            res.add(i);
        int m=2;
        while(true){
            if(arr.size()==0){
                for(int i=0;i<res.size();i++){
                    if(i%m==0)
                        arr.add(res.get(i));
                }
                if(arr.size()==1)
                    return arr.pop();
                res.clear();
                arr.addFirst(arr.removeLast());     //重新放置，将最后一个人放到第一个
            }else if(res.size()==0){
                for(int i=0;i<arr.size();i++){
                    if(i%m==0)
                        res.add(arr.get(i));
                }
                if(res.size()==1)
                    return res.pop();
                arr.clear();
                res.addFirst(res.removeLast());
            }
            m++;
        }
    }

    public static void main(String[] args) {
        System.out.println(getResult(5));

    }
}
