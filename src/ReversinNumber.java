public class ReversinNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;
        System.out.println("Original number : " + num);
        while(num!=0){
            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            // remove the last digit from num
            num /= 10;

        }
        System.out.println("Reversed number : " +reversed);

    }
}
