import java.util.*;

class Student {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age=age;
        this.score = score;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class ListBit {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(13);
        list.add(45);
        list.add(6);
        list.add(10);
        Collections.sort(list);  //链表里边排序用Collections工具类   类比于Arrays.Sort
        System.out.println(list);
    }
    public static void main1(String[] args) {
        ArrayList<Student> stu=new ArrayList<>() ;
        Student student1=new Student("bit",13,90.1);
        Student student2=new Student("bit1",13,80.1);
        Student student3=new Student("bit2",13,70.1);
        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        System.out.println(stu.get(0));

        //Iterator是一个迭代器    遍历顺序表  iterator是一个方法   iterable是一个接口
        Iterator<Student> it=stu.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
