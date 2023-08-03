public class FactorialOfANumnber {
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for any number is less than 0");
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("The factorial of  number 5 is : " + factorial(5));
    }

}
