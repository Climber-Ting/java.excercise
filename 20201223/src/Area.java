import java.util.*;
class Shape{
    private int x;
    private int y;
}
class Rectangle extends Shape{
    int ch;
    int k;
    public int Rectangle(){

    }
    public int GetArea(){
        return ch*k;
    }
}
class Circle extends Shape{
    int r;
    public double GetArea(){
        return 3.14*r*r;
    }
}
class Square extends Rectangle{
    int a;
    public int GetArea(){
        return a*a;
    }
}
public class Area{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int ch=input.nextInt();
        int k=input.nextInt();
        int r=input.nextInt();
        int a=input.nextInt();
        System.out.println();
    }
}







