public class stringBuilder_1 {
    public static void main(String[] args) {

        // Creating a stringBuilder
        StringBuilder sb = new StringBuilder("Shubham");
        System.out.println(sb);


        // finding character at index 0
        // use chatAt function
        StringBuilder op = new StringBuilder("Bhoite");
        System.out.println(op.charAt(0));
        // It will print B


        // Changing characters at specific index
        // use setCharAt
        op.setCharAt(0,'A');
        System.out.println(op);
        // It'll print Ahoite


        // Adding element in String
        op.insert(0,'B');
        System.out.println(op);
        // It'll print BAhoite


        // Deleting element from a String
        // We gave range of index here what we wanted to delete
        op.delete(1,2);
        System.out.println(op);
        // It will print Bhoite
        

        // Appending elements in String
        op.append('S');
        System.out.println(op);
        // It will print BhoiteS

        // Length of String
        System.out.println(op.length());
        

        // Reversion a string
        System.out.println(op.reverse());
        

        //Reversing a String without using a function
        StringBuilder rev = new StringBuilder("Hello");

        for (int i=0;i<rev.length()/2;i++){
            int front = i;
            int back = rev.length()-1-i;  //5-1- = 4

            char frontChar = rev.charAt(front);
            char backChar = rev.charAt(back);

            rev.setCharAt(front,backChar);
            rev.setCharAt(back,frontChar);

        }

        System.out.println(rev);
    }
}
