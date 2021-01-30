import java.util.Arrays;

class Heap{
    int[] elem=new int[30];
    int usedSize;
    public Heap(){

    }
    public Heap(int[] arr){
        if(arr.length>this.elem.length){
            throw new RuntimeException("数组超过指定大小！");
        }
        for(int i=0;i<arr.length;i++){
            this.elem[i]=arr[i];
            this.usedSize++;
        }
        for(int i=(this.usedSize-1-1)/2;i>=0;i--){
            adjustDown(i,this.usedSize);
        }
    }
    public int poll(){
        int ret;
        if (isEmpty()){
            ret=-1;
        }
        else{
            ret=this.elem[0];
            this.elem[0]=this.elem[this.usedSize-1];
            this.usedSize--;
            adjustDown(0,this.usedSize);
        }
        return ret;
    }

    public void offer(int elem){
        if(!isFull()){
            this.elem[this.usedSize]=elem;
            this.usedSize++;
            adjustUp(this.usedSize-1);
        }
    }
    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    public boolean isEmpty(){
        return this.usedSize == 0;
    }
    public void show(){
        System.out.print("[");
        for(int i=0;i<this.usedSize;i++){
            if(i==this.usedSize-1){
                System.out.print(this.elem[i]);
                break;
            }
            System.out.print(this.elem[i]+",");
        }
        System.out.println("]");
    }
    //不能传数组，直接传根下标和数组长度，在类对象elem本身修改
    public void adjustDown(int parent,int len){
        int leftChild = parent * 2 + 1;
        int rightChild = parent * 2 + 2;
        if (leftChild < len && rightChild < len) {
            if (this.elem[leftChild] >= this.elem[rightChild]) {
                if(this.elem[leftChild]>this.elem[parent]){
                    int temp = this.elem[parent];
                    this.elem[parent] = this.elem[leftChild];
                    this.elem[leftChild] = temp;
                    parent = leftChild;
                    adjustDown(parent, len);
                }
            }
            else {
                if(this.elem[rightChild]>this.elem[parent]){
                    int temp = this.elem[parent];
                    this.elem[parent] = this.elem[rightChild];
                    this.elem[rightChild] = temp;
                    parent = rightChild;
                    adjustDown(parent, len);
                }
            }
        } else if (leftChild < len && rightChild >= len) {
            if(this.elem[leftChild]>this.elem[parent]){
                int temp = this.elem[parent];
                this.elem[parent] = this.elem[leftChild];
                this.elem[leftChild] = temp;
                parent = leftChild;
                adjustDown(parent, len);
            }
        }
    }
    public void adjustUp(int child){
        int parent=(child-1)/2;
        while(child>0){
            if(this.elem[child]>this.elem[parent]){
                int temp=this.elem[parent];
                this.elem[parent]=this.elem[child];
                this.elem[child]=temp;
                child=parent;
                parent=(child-1)/2;
            }
            else{
                break;
            }
        }
    }
}
public class MyHeap {
    public static void main1(String[] args) {
        int[] arr = {27, 15, 19, 18, 28, 34, 65, 49, 25};
        Heap heap = new Heap(arr);
        heap.show();
        heap.offer(37);
        heap.show();
        heap.poll();
        heap.show();
    }

    public static void main2(String[] args) {
        int[] arr={9,10,4,5,7,1};
        Heap heap = new Heap(arr);
        heap.show();
        heap.poll();
        heap.show();
        heap.poll();
        heap.show();
    }
    public static void main(String[] args) {
        int[] stones={9,10,4,5,7,1};
        Heap heap=new Heap(stones);
        while(heap.usedSize>1){
            int a=heap.poll();
            int b=heap.poll();
            if(a!=b){
                int ret=Math.abs(a-b);
                heap.offer(ret);
            }
        }
        if (heap.usedSize==1){
            System.out.println(heap.poll());
        }else {
            System.out.println(0);
        }
    }

}
