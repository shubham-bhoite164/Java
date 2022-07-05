import java.util.*;
public class string_3_allFunctions {
    public static void main(String[] args) {
        // Length of String
        String name = "Shubham Bhoite";
        System.out.println(name.length());



        // Printing characters one by one
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }



        // Comparing strings
        String name1 = "Shubham";
        String name2 = "Shubham";

        // If string1>string2 it will return any +ve number
        // If string1<string2 it will return any -ve number
        // If string1==string2 it will return 0

        if (name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }
        else {
            System.out.println("Strings are not equal");
        }


        

        // Finding a substring from a string
        // sentence.substring(beginning index,end index)
        String sentence = "My name is Shubham";
        String name3 = sentence.substring(11,18);
        System.out.println(name3);

    }
}
