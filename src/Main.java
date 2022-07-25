import java.util.Scanner;
public class Main {
    // Object is created during runtime
    public static void main(String[] args) {
        /**
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        //System.out.println(circle.getArea());
        circle.setRadius(5.5);
        System.out.println("Radius of the circle is "+ circle.getRadius() + ".");
        circle.setColor("Blue");
        System.out.println("Color of the circle is "+ circle.getColor() + ".");
        System.out.println("Circumference of the circle is "+ circle.getCircumference());
        System.out.println("Area of the circle is "+ circle.getArea(    ));
        String info = circle.toString();
        System.out.println(info);
         */

        /**
         *      * * * * *
         *        * * * *
         *          * * *   rows        space       columns
         *            * *     5         0             5
         *              *     4         1             4
         *                    3         2             3
         *                    2         3             2
         *                    1         4             1
         *            */

        int n = 5;
        for(int i = 5; i >= 1; i--) {
            for(int j = 0; i < 5; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
        }
    }
}
class Circle {
    private double radius;
    private String color;

    Circle() {
        System.out.println("Default Constructor.");
        radius = 1.0;
        color = "red";
    }

    Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Circle { radius: "+ this.radius + " color: "+ this.color + " }";
    }
}
