import java.util.Scanner;

public class Questions_10_1 {
    //Enter 3 numbers from the user & make a function to print their average.
    public static int Average(int a,int b,int c){
        int avg = (a + b + c )/ 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int a = sc.nextInt();

        System.out.println("Enter the number 2");
        int b = sc.nextInt();

        System.out.println("Enter the number 3");
        int c = sc.nextInt();

        int avg = Average(a,b,c);
        System.out.println(avg);
    }
}
