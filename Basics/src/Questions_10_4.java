import java.util.Scanner;

public class Questions_10_4 {
    // Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void area(double r){
        double area = 3.14*Math.pow(r,2);
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");

        double r = sc.nextDouble();
        area(r);
    }
}
