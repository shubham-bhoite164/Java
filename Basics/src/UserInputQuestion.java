import java.util.Scanner;

public class UserInputQuestion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of Sub1");
    int Sub1 = sc.nextInt();

    System.out.println("Enter the marks of Sub2");
    int Sub2 = sc.nextInt();

    System.out.println("Enter the marks of Sub3");
    int Sub3 = sc.nextInt();

    double perc = ((Sub1+Sub2+Sub3)/3);
        System.out.println(perc);

    }
}
