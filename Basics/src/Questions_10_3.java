import java.util.Scanner;

public class Questions_10_3 {
    // Write a function which takes in 2 numbers and returns the greater of those two.
    public static void returnGreaterNum(int a,int b){
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number 1");
        int a = sc.nextInt();

        System.out.println("Enter the Number 2");
        int b = sc.nextInt();

        returnGreaterNum(a,b);
    }
}
