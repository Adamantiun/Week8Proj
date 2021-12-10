package pt.up.fe.ldts.example2;

public class Circle extends Shape {

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        r = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, r);
    }
}
