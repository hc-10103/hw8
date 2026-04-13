package model;

public class Triangle implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("yeah");
        System.out.println("논리설계 끝!");
    }

    public String getName() {
        return "Triangle";
    }

    public double getArea() {
        return width * height / 2;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt(width * width + height * height);
        return width + height + hypotenuse;
    }

    public void printShape() {
        System.out.println(getName() + " " + getArea() + " " + getPerimeter());
    }
}