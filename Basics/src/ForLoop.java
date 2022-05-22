public class ForLoop {
    public static void main(String[] args) {
        //Printing the numbers from 1 to 10

        //for (initialization; condition; updation);
     for (int counter =0; counter<11; counter++){
         System.out.println(counter);
     }


     // Sum of Natural numbers till 1000
        int sum = 0;
        for (int i =0; i<1000; i++){
            sum = sum+i;
        }
        System.out.println("Sum = " + sum);

    }
}
