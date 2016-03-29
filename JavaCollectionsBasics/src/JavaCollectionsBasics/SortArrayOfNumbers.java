package JavaCollectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anton on 16-3-29.
 */
public class SortArrayOfNumbers {
    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();
            int[] Array = new int[number];
            for (int a = 0; a < Array.length; a++) {
                Array[a] = console.nextInt();
            }
            Arrays.sort(Array);
            for (int i = 0; i < Array.length; i++) {
                System.out.print(Array[i] + " ");
            }

        } catch (Exception a) {
            System.out.println("Invalid input!");
        }

    }
}
