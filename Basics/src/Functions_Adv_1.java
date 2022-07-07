import java.util.Scanner;

public class Functions_Adv_1 {
    public static void main(String[] args) {
        
        int ans = sum();
        System.out.println(ans);
        
    }

    static int sum() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("ENter the num2");
        int b = sc.nextInt();

        int add = a+b;
        return add;

    }
}




