public class FindingPrimeFactors {
    /*
    Create a function say isprime(int n), that will return 1 if a number is prime, otherwise return 0.
    primeFactors(int n), will print the prime factors of the number.
    Run a loop from 2 to n,
    Check if it is prime, then
    Create a variable x to hold n,
    Run a while loop that will terminate when ( x is not divisible by i)
    Inside that loop print i and decrement as, x = x/2
     */
    public static void main(String[] args) {
        int number = 20;
        for (int i = 2;i<=number;i++){
            while(number % i ==0){
                System.out.println(i+ "");
                number = number / i;
            }
        }
        if (number > 2){
            System.out.println(number);
        }
    }
}
