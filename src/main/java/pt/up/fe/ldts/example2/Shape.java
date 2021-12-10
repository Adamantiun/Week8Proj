package pt.up.fe.ldts.example2;

abstract class Shape {

    protected double x;
    protected double y;
    protected double r;

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(GraphicFramework graphics);
}
