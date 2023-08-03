public class FindingFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "teeter";
        for (char i : str.toCharArray()){
            if (str.indexOf(i) == str.lastIndexOf(i)){
                System.out.println("First no-repeated character is :" + i);
                break;
            }
        }
    }
}
