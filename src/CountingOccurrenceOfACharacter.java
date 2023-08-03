public class CountingOccurrenceOfACharacter {
    public static void main(String[] args) {
        //first way
        String input = "aaabbbcggshsjskshjgjsdkfsjk";
        char search = 'a';
        int charCount = 0;
//        for (int i = 0;i<input.length();i++){
//            if (input.charAt(i) == search){
//                charCount++;
//            }
//        }
        int occurrences = countoccurrence(input,search);
        System.out.println(occurrences);
        //System.out.println("The character '" + search + "' appears " + charCount + " times");
    }
    //second way
    public static int countoccurrence(String input,char targetChar){
        int count = 0;
        for (char c : input.toCharArray()){
            if (c == targetChar){
                count++;
            }
        }
        return count;
    }
}
