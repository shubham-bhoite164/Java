public class linearSearch_String {
    public static void main(String[] args) {
        String name = "Shubham";
        char target = 'u';
        System.out.println(linearSearchString(name, target));
    }

    static boolean linearSearchString(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){  // charAt method is used to find character at specific index
                return true;
            }
        }
        return false;
    }
}
