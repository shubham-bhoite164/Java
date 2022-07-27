public class EvenDigits {
    public static void main(String[] args) {
        // Here we have given a number in which we have to find the even
        // 122 total are 3 numbers  it is odd
        // 1287 total are 4 numbers it is even
        //34 total are 2 numbers it is even
        int num[] = {12,134,2,6,7896};
        System.out.println(findNumbers(num));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // FUnction to check it contains even number of digits or not
    static boolean even(int num){
       int numOfDigits = digits(num);
        if (numOfDigits%2==0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int digits(int num){
        int count = 0;

        while (num>0){
            count++;
            num = num/10;
        }

        return count;
    }

}