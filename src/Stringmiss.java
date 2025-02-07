import java.util.*;

public class Stringmiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();  // Close scanner to prevent memory leak

        findMissingLetters(str1, str2);
    }

    static void findMissingLetters(String str1, String str2) {
        StringBuilder missingChars = new StringBuilder();

        // Convert second string to a HashSet for quick lookup
        Set<Character> str2Set = new HashSet<>();
        for (char c : str2.toCharArray()) {
            str2Set.add(c);
        }

        // Find characters in str1 that are missing in str2
        for (char c : str1.toCharArray()) {
            if (!str2Set.contains(c)) {
                missingChars.append(c);
            }
        }

        System.out.println(missingChars.toString());
    }
}

