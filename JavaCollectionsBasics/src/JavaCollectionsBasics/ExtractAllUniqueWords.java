package JavaCollectionsBasics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by anton on 16-3-29.
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split("\\W+");

        // Main Logic
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        // Output
        for (String uniqueWordString : uniqueWords) {
            System.out.print(uniqueWordString + " ");
        }
    }
}
