public class CalculatingSumInArray {
    public static void main(String[] args) {
        int[] arr = {10,13,15,17,34,55};
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
