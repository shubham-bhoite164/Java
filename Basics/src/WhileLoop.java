public class WhileLoop {
    public static void main(String[] args) {
        // Adding 1 to 10
        int i = 0;
        int sum = 0;
        while (i<11) {
            i++;
            sum = sum + i;
            System.out.println("Total Sum is :- " + sum);
        }
        // Printing 1 to 10
        while (i<11) {
            System.out.println(i);
            i++;
        }
    }
}
