import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        num.add(435321);
        num.add(2233);
        num.add(43);
        num.add(5456);
        num.add(657);


        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        int element = num.get(0);
        System.out.println(element);

        // How to add element in between
        num.add(1,4);
        System.out.println(num);

        // To change the element from the list
        num.set(1,9);
        System.out.println(num);

        // Delete Element
        num.remove(1);
        System.out.println(num);

        // Size of Arraylist
        int size = num.size();
        System.out.println(size);

        // Loops
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " , ");
        }
        System.out.println();

        // Sorting in Arraylist
        Collections.sort(num);
        System.out.println(num);


    }
}