public class RemovingWhiteSpacesInAstring {
    public static void main(String[] args) {
        String sentence = "Ali looks at the white horse";
        System.out.println("Original sentence is : " + sentence);
        sentence = sentence.replaceAll("\\s","");
        System.out.println("Sentence after removing white spaces : " + sentence);
    }
}
