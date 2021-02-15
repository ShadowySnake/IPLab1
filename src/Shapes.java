import java.util.Scanner;

abstract class Shape{
    double area;
    public void PrintArea(){
        System.out.println(area);
    }
    abstract void onAreaChange();
}

class Circle extends Shape {
    double radius;
    double pi = 3.14;

    public Circle(){
        radius = 0.0;
    }

    public void SetRadius(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        radius = myObj.nextFloat();

    }

    void onAreaChange(){
        area = pi * radius * radius;
    }

}

class Rectangle extends Shape {
    double height, width;

    public Rectangle(){
        height = width = 0.0;
    }

    public void SetHeight(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter height of rectangle:");
        height = myObj.nextFloat();
    }

    public void SetWidth(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter width of rectangle:");
        width = myObj.nextFloat();
    }

    void onAreaChange(){
        area = height * width;
    }

}

class Triangle extends Shape {
    double base, height;
    public Triangle(){
        base = height = 0.0;
    }
    public void SetHeight(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter height of triangle:");
        height = myObj.nextFloat();
    }

    public void SetBase(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        base = myObj.nextFloat();
    }

    void onAreaChange(){
        area = (base * height) / 2;
    }
}

class Square extends Rectangle {
    public Square(){
        width = 0;
    }
    void onAreaChange(){
        area = width * width;
    }
}

interface Teach{
    void institution();
    void year();
}

class School implements Teach{
    public void institution(){
        System.out.println("No name given...");
    }
    public void year(){
        System.out.println("Unknown!");
    }
    public void printNews(){
        System.out.println("No announcements.");
    }
}

class Nightmare extends School{
    public void printNews(){
        System.out.println("Good luck.");
    }
}

public class Shapes {
    public static void main(String[] args){

        Circle c1 = new Circle();
        c1.SetRadius();
        c1.onAreaChange();
        c1.PrintArea();

        Rectangle r1 = new Rectangle();
        r1.SetHeight();
        r1.SetWidth();
        r1.onAreaChange();
        r1.PrintArea();

        Triangle t1 = new Triangle();
        t1.SetBase();
        t1.SetHeight();
        t1.onAreaChange();
        t1.PrintArea();

        Square s1 = new Square();
        s1.SetWidth();
        s1.onAreaChange();
        s1.PrintArea();

        School sch = new Nightmare();
        sch.institution();
        sch.year();
        sch.printNews();

    }
}