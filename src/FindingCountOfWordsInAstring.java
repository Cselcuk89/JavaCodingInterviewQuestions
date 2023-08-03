public class FindingCountOfWordsInAstring {
    public static void main(String[] args) {
        /*
        Initialize count with 1 as if there are no spaces in the string, then there will be one word in the String.
        Check if you encounter any space.
        Once you find the space, check it next character. If it is not space then we found a word in the String.Increment the count variable.
        Once you reach end of String, count variable will hold number of words in the String.
         */
        //first way
        String str = "welcome to java world and be ready to solve coding challenges";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);

        //second way
        String str1 = "welcome to java world and be ready to solve coding challenges";
        str1.trim();
        String[] words = str1.split("\\s+");// Splitting the string into words
        int wordCount = words.length;
        System.out.println("Number of words : " + wordCount);
    }
}
