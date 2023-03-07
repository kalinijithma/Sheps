public class Circle implements GeometricObject {
    double radius=1.0;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter(){
        return (2*Math.PI*radius*radius);
    }

    @Override
    public double getArea(){
        return(Math.PI*radius*radius);
    }
}
