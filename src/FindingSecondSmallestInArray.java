public class FindingSecondSmallestInArray {
    /*
    Take a variable say smallest = Integer.MAX_VALUE
    Run a loop over the entire array and check if (arr[i]<smallest)
    Then set smallest = arr[i].
    Declare another variable say sec_smallest = Integer.MAX_VALUE
    Run a loop and check if arr[i] != smallest and arr[i] < sec_smallest
    Then print(sec_smallest) after completing the iteration.
     */
    public static int secondSmallest(int arr[],int n){
        // assigning first element as smallest temporarily
        int smallest = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        // temporarily assinging largest max value
        int secondSmallest = Integer.MAX_VALUE;
        // finding second smallest here
        for (int i = 0;i<n;i++){
            if (arr[i] != smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int arr[] = {12,13,1,10,34,10};
        int n =arr.length;
        System.out.println(secondSmallest(arr,n));
    }
}
