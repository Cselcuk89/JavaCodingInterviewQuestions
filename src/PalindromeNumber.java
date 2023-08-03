import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String reverse = "";
        String num = scan.nextLine();
        int length = num.length();
        for (int i = length-1;i>=0;i--){
            reverse = reverse + num.charAt(i);
        }
        if (num.equals(reverse)){
            System.out.println("The entered number " + num + " is a palindrome.");
        }else {
            System.out.println("The entered number " + num + " is not a palindrome.");
        }

    }
}
