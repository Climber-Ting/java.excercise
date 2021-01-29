import java.util.*;

/*
    有一堆石头，每块石头的重量都是正整数。
    每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。
    假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
    如果 x == y，那么两块石头都会被完全粉碎；
    如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
    最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
示例：
    输入：[2,7,4,1,8,1]
    输出：1
    解释：
        先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
        再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
        接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
        最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。
 */


public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        HeapDemo heap=new HeapDemo();
        heap.crateBigHeap(stones);
        while(heap.usedSize>1){
            int a=heap.poll();
            int b=heap.poll();
            if(a!=b){
                int ret=Math.abs(a-b);
                heap.push(ret);
            }
        }
        if (heap.usedSize==1){
            return heap.poll();
        }else {
            return 0;
        }
    }
}
class HeapDemo {

    public int[] elem;
    public int usedSize;
    public HeapDemo() {
        this.elem = new int[10];
    }

    public void crateBigHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //elem当中已经存放了元素
        for (int i = (this.usedSize - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(i, this.usedSize);
        }
    }
    public void adjustDown(int parent,int len) {
        int child = 2*parent+1;
        //child < len 说明有左孩子
        while (child < len) {
            //child+1 < len 判断是 当前是否  有右孩子
            if(child+1 < len && this.elem[child] < this.elem[child+1]) {
                child++;//
            }
            //child 下标 一定是 左右孩子的最大值下标
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                //因为是从最后一棵树开始调整的  只要我们 找到了这个
                // this.elem[child] <= this.elem[parent]   后续就不需要循环了
                //后面的都已经是大根堆了
                break;
            }
        }
    }
    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }
    public void push(int val) {
        if(isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;//11

        adjustUp(this.usedSize-1);
    }

    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        int ret = this.elem[0];
        //删除
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;//9
        adjustDown(0,this.usedSize);
        return ret;
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }
}
