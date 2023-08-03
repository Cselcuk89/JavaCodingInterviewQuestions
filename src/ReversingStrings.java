public class ReversingStrings {
    public static void main(String[] args) {
        //first way
//        String originalStr = "Hello";
//        //String reversedStr = "";
//        char[] charArr = originalStr.toCharArray();
//        for (int i = charArr.length-1;i>=0;i--){
//            System.out.print(charArr[i]);
//        }
        //second way
        String str = "Let's play Chardee MacDennis!";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }



}
