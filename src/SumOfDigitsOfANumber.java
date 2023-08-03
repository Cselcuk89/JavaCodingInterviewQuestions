public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int num = 1234456,
                sum = 0;
        while(num!= 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits : " + sum);
    }
}
