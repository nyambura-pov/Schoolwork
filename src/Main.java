import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a radius for a circle:");
        int radius=scanner.nextInt();

        Circle shape=new Circle(radius);
        System.out.println("Enter a radius and a height for a cylinder");
        int Radius=scanner.nextInt();
        int height=scanner.nextInt();

        Cylinder shape2=new Cylinder(radius,height);
        shape.showperimeter();
        shape2.displaySurfaceArea();
        shape.showarea();
    }
}