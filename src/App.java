public class App {
    public static void main(String[] args) {
        // encode("hello");
        System.out.println(encode("hello"));
    }

    public static String encode(String word) {
String words = "";
        int shift = 1;
        for (int i = 0; i < word.length(); i++) {
            // int shift = 1;
            char letter = word.charAt(i);
            int number = (int) letter;
            number = number - 97;
            number = shift + number;
            number = number % 26;
            number = number + 97;
            char newletter = (char) (number);
            words += newletter;
            shift = shift * 2;
            
            // System.out.println(encode("hello"));
        } 
        
    String words2 = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            char letter = words.charAt(i);
            words2 += letter;
        


            
        }

        return words2;
    }
}
