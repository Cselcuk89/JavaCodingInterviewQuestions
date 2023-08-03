public class FindingSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {13,23,15,34,55};
        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
