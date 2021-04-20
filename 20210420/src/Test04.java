import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        while(in.hasNext()){
            queue.offer(in.nextInt());
        }
        for (int i=0)
        System.out.println(queue.toArray());



    }
}
