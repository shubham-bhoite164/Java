import java.util.Scanner;

public class FunctionsAndMethods1 {
    public static int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a");
        int a = sc.nextInt();

        System.out.println("Enter the number b");
        int b = sc.nextInt();

        int sum = addition(a,b);
        System.out.println(sum);
    }
}
