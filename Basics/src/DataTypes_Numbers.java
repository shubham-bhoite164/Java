public class DataTypes_Numbers {
    public static void main(String[] args){
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String


        // Integer Types

        // The "byte" data type can store whole numbers from -128 to 127.
        byte num1 = 100;
        System.out.println(num1);

        // The "short" data type can store whole numbers from -32768 to 32767:
        short Num2 = 5000;
        System.out.println(Num2);

        // The "int" data type can store whole numbers from -2147483648 to 2147483647
        int Num3 = 100000;
        System.out.println(Num3);

        // The "long" data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        long Num4 = 15000000000L;
        System.out.println(Num4);



        // Floating Point Types

        //The float and double data types can store fractional numbers.
        // Note that you should end the value with an "f" for floats and "d" for doubles

        float Num5 = 5.75f;
        System.out.println(Num5);

        double Num6 = 19.99d;
        System.out.println(Num6);


        // always prefer double because it stores more values than float

        double num7 = 456.456d;
        System.out.println(num7);


        //Scientific Numbers
        //A floating point number can also be a scientific number with an "e" to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}
