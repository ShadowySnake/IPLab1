abstract class Shape{
    double area;
    public void Shape(){
        area = 0;
    }
    public void PrintArea(){
        System.out.println(area);
    }
    abstract void onAreaChange();
}

class Circle extends Shape {
    double radius;
    double pi = 3.14;

    public void Circle(){
        radius = 0;
    }

    public void SetRadius(double x){
        radius = x;
    }

   void onAreaChange(){
        area = pi * radius * radius;
   }
}
public class Shapes {
    public static void main(String args[]){
      Circle c1 = new Circle();
      c1.SetRadius(10);
      c1.onAreaChange();
      c1.PrintArea();
    }
}
