public class MaxWealth {
    public static void main(String[] args) {

//        Input: accounts = [[1,5],[7,3],[3,5]]
//        Output: 10
//        Explanation:
//        1st customer has wealth = 6
//        2nd customer has wealth = 10
//        3rd customer has wealth = 8
//        The 2nd customer is the richest with a wealth of 10.

    }

    public int maximumWealth(int[][] accounts){
            // person = rol
            // account = col
            int ans = Integer.MIN_VALUE;
            for (int[] ints : accounts) {
                // when you start a new row, take a new sum for that row
                int sum = 0;
                for (int anInt : ints) {
                    sum += anInt;
                }
                // now we have sum of accounts of person
                // check with overall ans
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
    }
}
