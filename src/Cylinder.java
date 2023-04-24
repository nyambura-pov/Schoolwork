public class Cylinder extends Circle {

    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    //overriding
    @Override
    public double getArea(int radius){
        double x=((3.142*Math.pow(radius,2))*2)+((3.142*2*radius)*height);
        return x;
    }
    public void displaySurfaceArea()
    {
        System.out.println("The surface area of this cylinder is:"+getArea(getRadius()));
    }
}

