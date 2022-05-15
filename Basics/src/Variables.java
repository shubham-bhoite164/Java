public class Variables {
    public static void main(String[] args){

        // Storing value in variable
        int n = 4;
        System.out.println(n);


        int num = 4;
        num = 5; // reassigning value to the variable num
        System.out.println(num);
        // It will print 5

        // Storing and adding
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1+num2);

        // For String
        String name = "Shubham";
        System.out.println(name);

        // You can also use the + character to add a variable to another variable
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Declare Many Variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);




       // Identifiers
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

    }
}
