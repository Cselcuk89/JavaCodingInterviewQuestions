public class FindingLargestNumberInArray {
    /*
    Declare a variable say max and initialize it with array first element.
    Run a loop from index 1 to N, and check
    If arr[i]>max, then set max = arr[i]
    After complete iteration print max.
     */
    public static void main(String[] args) {
        int[] arr = {12,13,1,10,34,10};
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
