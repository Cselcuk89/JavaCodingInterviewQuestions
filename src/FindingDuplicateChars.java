public class FindingDuplicateChars {
    public static void main(String[] args) {
        //first way
        String str = "hi my name is cagri";
        int count = 0;
        char[] chars = str.toCharArray();
//        System.out.println("Duplicate characters are: ");
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    System.out.print(chars[j] + " ");
//                    count++;
//                    break;
//                }
//            }
//        }
        System.out.print(duplicateChars(str));
    }

    //second way
    public static String duplicateChars(String input) {
        char[] chars = input.toCharArray();
        String duplicates = "";
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    duplicates += chars[i] + "";
                }
            }


        }
        return duplicates;
    }
}





