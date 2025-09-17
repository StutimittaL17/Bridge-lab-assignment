import java.util.Scanner;

public class Circle {
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    double area(double radius)
    {
        return (3.14* radius*radius);
    }
    double circumference(double radius)
    {
        return (2*3.14*radius);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r= sc.nextDouble();
        Circle a=new Circle(r);
        System.out.println(a.area(r));
        System.out.println(a.circumference(r));
    }
}
