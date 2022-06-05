 import java.util.Scanner;

public class Functions_Examples2 {
//    // Multiplication of two numbers

//    public static int multiplicaion(int a,int b){
//      int  mul = a*b;
//      return mul;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Number 1");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the Number 2");
//        int b = sc.nextInt();
//
//        int mul = multiplicaion(a,b);
//        System.out.println(mul);
//    }


    public static int substraction(int a, int b){
        int sub = a-b;
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number 1");
        int a = sc.nextInt();

        System.out.println("Enter the Number 2");
        int b = sc.nextInt();

        int sub = substraction(a,b);
        System.out.println(sub);

    }
}


