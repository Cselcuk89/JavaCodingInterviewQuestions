import java.util.Arrays;

public class CheckingAnagramStrings {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //check if the legths are the same
        if (str1.length() == str2.length()){
            //convert strings to char arrays
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();
            //sorting the arrays
            Arrays.sort(char1);
            Arrays.sort(char2);
            //if the sorted char arrays are the same and then two strings are anagram
            boolean result = Arrays.equals(char1,char2);
            if (result){
                System.out.println(str1 + " and " + str2 + " are anagram");
            }else {
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        }

    }
}
