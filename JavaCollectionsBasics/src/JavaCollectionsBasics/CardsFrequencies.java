package JavaCollectionsBasics;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by anton on 16-3-29.
 */
public class CardsFrequencies {
    public static void main(String[] args) {

        // Input
        Scanner input = new Scanner(System.in);
        String[] allCards = input.nextLine().split("[ ♥♣♦♠]+");
        Map<String, Integer> cardFaces = new LinkedHashMap<>();

        // Main Logic
        for (String card : allCards) {
            Integer count = cardFaces.get(card); // get the value of this key(card)
            if (count == null) {
                count = 0;
            }
            cardFaces.put(card, count + 1);
        }

        // Output
        for (Map.Entry<String, Integer> entry : cardFaces.entrySet()) {
            double percentage = ((double) entry.getValue() * 100) / allCards.length;
            System.out.printf("%s -> %.2f%%\n", entry.getKey(), percentage);
        }
    }
}
