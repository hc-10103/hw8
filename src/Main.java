import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape[] shapes = new Shape[5];

        System.out.println("  ");
        for (int i = 0; i < 5; i++) {
            String type = sc.next();

            if (type.equals("rectangle  ")) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                shapes[i] = new Rectangle(w, h);
            }
            else if (type.equals("triangle")) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                shapes[i] = new Triangle(w, h);
            }
            else if (type.equals("circle")) {
                double r = sc.nextDouble();
                shapes[i] = new Circle(r);
            }
        }

        for (int i = 0; i < 5; i++) {
            shapes[i].printShape();
        }
    }
}