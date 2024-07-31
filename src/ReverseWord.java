public class ReverseWord {
    public static String reverse(String word) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String word = "Fatemeh Salem";
        String reversedWord = reverse(word);
        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
}
