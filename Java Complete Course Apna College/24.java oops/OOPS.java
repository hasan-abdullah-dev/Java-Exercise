class Student {
    String name;
    int age;
/*     public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    } */
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    //compiler time polymorphism method overloading
    public void displayInfo(String name) {
        System.out.println(name);
    }
    public void displayInfo(int age) {
        System.out.println(age);
    }
    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

class Pen {
    String colour;

    public void printColour() {
        System.out.println("The color of this Pen is " + this.colour);
    }
}
//runtime polymorphism/inheritance
class Shape{
    String colour;
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5*b*h);
    }
}
//hierarchical inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

//multilevel inheritance

class equilateralTriangle extends Triangle {
    int side;
}

//abstraction
abstract class Animal {
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class OOPS {
    public static void main(String[]args){
/*         Student s1 = new Student();
        s1.name = "Abdullah";
        s1.age = 100;
        s1.getInfo();
        
        Student s2 = new Student();
        s2.name = "X";
        s2.getInfo(); */

        //=====================
        Pen p1 = new Pen();
        p1.colour = "Black";
        p1.printColour(); 

        //=====================
        Student s1 = new Student("Abdullah", 100);
/*         s1.getInfo();   */  
        s1.displayInfo("Abdullah");
        s1.displayInfo(100);
        s1.displayInfo("Abdullah",100);

        //=====================
        Triangle t1 = new Triangle();
        t1.colour = "black";
        t1.area(6,3);
        //======================
        Circle c1 = new Circle();
        c1.area(2);
        equilateralTriangle e1 = new equilateralTriangle();
        e1.area(6, 3);;
        //==================
        Horse horse = new Horse();
        horse.walk();
        horse.eat();  
        //Animal animal = new Animal(); cannot be instantiated abstract class
        //animal.walk();
    }    
}