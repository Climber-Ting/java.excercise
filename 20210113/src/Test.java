class Animal {
    public String name;
    private int age;
    /*static {
        System.out.println("Animal::static{}");
    }
    {
        System.out.println("Animal::{}");
    }
*/
    public Animal() {
        eat();
        System.out.println("Animal()");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal(String,int)");

    }

    public  void eat() {
        System.out.println(this.name+"eat()");
    }

}
class Dog extends Animal{
    /* static {
         System.out.println("Dog::static{}");
     }
     {
         System.out.println("Dog::{}");
     }*/
    public int leg;//狗腿的个数

    public Dog() {
        System.out.println("Dog()");
    }
    public Dog(String name,int age) {
        super(name,age);
        System.out.println("Dog(String,int)");
    }
    public void wangwang() {
        System.out.println("wangwang!!!");
    }
    public void eat() {
        System.out.println("Dog::eat()");
    }

}
class Bird extends Animal{
    /*static {
        System.out.println("Bird::static{}");
    }
    {
        System.out.println("Bird::{}");
    }*/
    public Bird() {
        System.out.println("Bird()");
    }

    public Bird(String name, int age) {
        super(name, age);
        System.out.println("Bird(String,int)");
    }

    public  void func() {
        System.out.println(super.name);
        super.eat();
    }

    public void fly() {
        System.out.println(this.name+"Bird::fly()");
        //age是私有的 并不是没有被继承 而是在类外不可以进行访问
        //System.out.println(this.age+"Bird::fly()");
    }
}

//super:父类对象的引用
public class Test  {


    public static void main(String[] args) {
        Animal animal =  new Dog();
        /*animal.name = "旺财";
        animal.eat();*/
        //animal.wangwang();
    }

    public static void func2(Animal animal) {

    }
    public static Animal func3() {
        return new Dog();
    }

    public static void main5(String[] args) {
        /*Animal animal =  new Dog();
        Dog dog = (Dog)animal;
        dog.wangwang();*/

        Animal animal2 =  new Dog();
        if(animal2 instanceof Bird) {
            Bird bird = (Bird)animal2;
            bird.fly();
        }

    }

    public static void main4(String[] args) {
        Dog dog = new Dog();
        dog.wangwang();

        Animal animal =  new Dog();
        func2(dog);
        //animal.wangwang();
        animal.name = "ffdasdaa";
        //animal.leg = 4;
    }



    public static void main3(String[] args) {
        Dog dog = new Dog();
        System.out.println("===========");
        Bird bird = new Bird();
        System.out.println("================");
    }





    public static void main1(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();

        Bird bird = new Bird();
        bird.name = "八哥";
        bird.eat();
    }
}

