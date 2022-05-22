import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int a = sc.nextInt();
        System.out.println("Enter the number2 ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(sum);

        float c = sc.nextFloat();
        double d = sc.nextDouble();
        
        
       System.out.println("Enter number 1");
       int a = sc.nextInt();
       float a = sc.nextFloat();
       System.out.println("Enter number 2");
       int b = sc.nextInt();
       float b = sc.nextFloat();

       int sum = a +b;
       float sum = a +b;
       System.out.println("The sum of these numbers is");
       System.out.println(sum);
       boolean b1 = sc.hasNextInt();
       System.out.println(b1);
       String str = sc.next();
    }
}
