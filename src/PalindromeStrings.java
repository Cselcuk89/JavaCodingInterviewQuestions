public class PalindromeStrings {
    public static void main(String[] args) {
        String str = "Radar";
        String reversed = "";
        int strLength = str.length();
        for (int i = strLength-1;i>=0;--i){
            reversed = reversed + str.charAt(i);
        }
        if (str.toLowerCase().equals(reversed.toLowerCase())){
            System.out.println(str + " is a palindrome string");
        }else{
            System.out.println(str + "is not a palindrome");
        }
    }


}
