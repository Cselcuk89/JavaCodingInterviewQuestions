public class PrimeNumber {
    //1.way
//    public static boolean isPrime(int n){
//        if (n == 0 || n == 1){
//            return false;
//        }
//        if (n == 2){
//            return true;
//        }
//        for (int i = 2;i<=n;i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
//        System.out.println(isPrime(19));
//        System.out.println(isPrime(25));
        //2.way
        int num = 29;
        boolean flag = false;
        for(int i = 2;i<=num/2;i++){
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    }

