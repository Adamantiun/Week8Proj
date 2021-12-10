package pt.up.fe.ldts.example2;

public class Rectangle extends Shape{

    private final double height;

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        r = width;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return r * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (r + height);
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawLine(x, y, x + r, y);
        graphics.drawLine(x + r, y, x + r, y + height);
        graphics.drawLine(x + r, y + height, x, y + height);
        graphics.drawLine(x, y + height, x, y);
    }
}
