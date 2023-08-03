import java.awt.desktop.PreferencesEvent;

public class ReversingWords {
    public static void main(String[] args) {
        System.out.println(reversingWords("I am John Doe"));
    }
    public static String reversingWords(String str){
        StringBuilder reversedWords = new StringBuilder();
        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");
        // loop over the array from back
        for (int i = words.length-1;i>=0;i--){
            // add words to reversedWords with space
            reversedWords.append(words[i] + " ");
        }
        // trim needed to remove last space in the end
        return reversedWords.toString().trim();


    }


}
