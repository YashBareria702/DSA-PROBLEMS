import java.util.Scanner;
public class AbcPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        String output = transformToFullAbc(input);
        System.out.println("Output: " + output);
    }

    public static String transformToFullAbc(String input) {
        int count = 0;
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);

            // Check for full or partial patterns that imply an "abc" block
            if (i + 1 < input.length()) {
                String pair = input.substring(i, i + 2);
                if (pair.equals("ab") || pair.equals("bc") || pair.equals("ac")) {
                    count++;
                    i += 2;
                    continue;
                }
            }

            // Single characters that imply abc
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                count++;
            }

            i++;
        }

        // If input was empty or didn't contain anything relevant, output nothing
        if (count == 0) return "";

        // Build the output
        StringBuilder output = new StringBuilder();
        for (int j = 0; j < count; j++) {
            output.append("abc");
        }
        // Calculate characters added
        int addedChars = output.length() - input.length();

        System.out.println("Characters added: " + addedChars);


        return output.toString();
    }
}