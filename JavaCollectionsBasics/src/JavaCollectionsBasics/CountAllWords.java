package JavaCollectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anton on 16-3-29.
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        String[] CountText = inputText.split("[\\W\\d]+");
        System.out.println(CountText.length);
        System.out.println(Arrays.toString(CountText));
    }
}
