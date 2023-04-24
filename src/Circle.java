public class Circle {
    private int radius;

    public Circle(int radius){this.radius = radius;}

    public void setRadius(int radius){this.radius = radius;}

    public int getRadius() {
        return radius;
    }

    public double getArea(int radius){
        double y=3.142*Math.pow(radius,2);
        return y;
    }

    public double getPerimeter(int radius){
        double z=3.142*2*radius;
        return z;
    }

    public void showperimeter()
    {
        System.out.println("The perimeter for your circle is:" +getPerimeter(radius));
    }

    public void showarea()
    {
        System.out.println("The area of your circle is:"+getArea(radius));
    }
}
