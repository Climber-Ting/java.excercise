import java.util.*;

public class MyArrayList {
    private int[]elem;   //null
    private int usedSize;

    public MyArrayList(){
        this.elem=new int[10];
    }

    public MyArrayList(int capacity){
        this.elem=new int[capacity];
    }

    //打印顺序表
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //判断顺序表是否为满
    private boolean isFull(){
        if(this.usedSize==this.elem.length)
            return true;
        else
            return false;
    }
    //在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()){
            System.out.println("顺序表已满！");
        }
        if(pos<0||pos>this.usedSize){
            System.out.println("插入位置不合法！");
        }
        for(int i=this.usedSize;i>pos;i--){
            this.elem[i]=this.elem[i-1];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    //默认插入到数组的最后
    public void add(int data) {
        if(isFull()){
            System.out.println("顺序表已满！");
        }
        this.elem[usedSize]=data;
        this.usedSize++;
    }

    //判断是否包含某个函数
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(toFind==this.elem[i]){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(toFind==this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(pos<this.usedSize&&pos>=0){
            return this.elem[pos];
        }
        return -1;
    }
    //给pos位置的元素 设为value
    public void setPos(int pos,int value){
        if(pos<this.usedSize&&pos>=0){
            this.elem[pos]=value;
        }
        return;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int search=search(toRemove);
        if(search==-1){
            System.out.println("不包含该元素！");
        }
        for(int j=search;j<this.usedSize-1;j++){
            this.elem[j]=this.elem[j+1];
        }
        this.usedSize--;
    }

    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }

    public static void main(String[] args) {
        MyArrayList arr1=new MyArrayList();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        arr1.display();
        System.out.println(arr1.search(30));
        System.out.println(arr1.contains(70));
        System.out.println(arr1.getPos(20));
        arr1.setPos(0,80);
        arr1.display();
        arr1.remove(40);
        arr1.display();
        arr1.clear();
        arr1.display();
    }
}

