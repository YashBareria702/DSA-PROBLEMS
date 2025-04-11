import java.util.Scanner;

public class PigLatinTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an English word: ");
        String word = scanner.nextLine().toLowerCase();
        
        String pigLatin = translateToPigLatin(word);
        System.out.println("Pig Latin: " + pigLatin);
    }
    
    public static String translateToPigLatin(String word) {
        if (word.isEmpty()) {
            return word;
        }
        
        // Check if the word starts with a vowel
        if (startsWithVowel(word)) {
            return word + "-yay";
        } else {
            // Find the index of the first vowel
            int firstVowelIndex = findFirstVowelIndex(word);
            
            if (firstVowelIndex == -1) {
                // No vowels found, treat as consonant word
                return word + "ay";
            } else {
                // Move consonants before first vowel to end and add "ay"
                String movedConsonants = word.substring(0, firstVowelIndex);
                String remainingLetters = word.substring(firstVowelIndex);
                return remainingLetters + "-"+movedConsonants + "ay";
            }
        }
    }
    
    private static boolean startsWithVowel(String word) {
        if (word.isEmpty()) return false;
        char firstChar = word.charAt(0);
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' 
            || firstChar == 'o' || firstChar == 'u';
    }
    
    private static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return i;
            }
        }
        return -1; // No vowels found
    }
}