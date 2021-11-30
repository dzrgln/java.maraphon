package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5),
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double redPerimeter =0;
        for(Figure x: figures){
            if (x.getColor() == "Red"){
                redPerimeter = redPerimeter + x.perimeter();
            }
        }
        return redPerimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double redArea =0;
        for(Figure x: figures){
            if ("Red".equals(x.getColor())){
                redArea = redArea + x.area();
            }
        }
        return redArea;
    }
}

abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();


}

class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        double area = this.radius * this.radius * Math.PI;
        return area;
    }

    @Override
    public double perimeter() {
        double perimetr = 2 * Math.PI * this.radius;
        return perimetr;
    }
}

class Rectangle extends Figure {

    private double height;
    private double wide;

    public Rectangle(String color, double height, double wide) {
        super(color);
        this.height = height;
        this.wide = wide;
    }

    @Override
    public double area() {
        double area = height * wide;
        return area;
    }

    @Override
    public double perimeter() {
        double perimetr = 2 * (height + wide);
        return perimetr;
    }
}

class Triangle extends Figure {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        double polP = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(polP * (polP - side1) * (polP - side2) * (polP - side3));
        return area;
    }

    @Override
    public double perimeter() {
        double perimetr = side1 + side2 + side3;
        return perimetr;
    }
}