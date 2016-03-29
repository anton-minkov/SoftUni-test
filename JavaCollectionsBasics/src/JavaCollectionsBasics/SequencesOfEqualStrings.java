package JavaCollectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anton on 16-3-29.
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] splitStr = text.split("\\s+");


        for (int i = 0; i < splitStr.length-1;i++){
            System.out.print(splitStr[i] + " ");
            if(!(splitStr[i].equals(splitStr[i+1]))){
                System.out.println();
            }
        }
        System.out.println(splitStr[splitStr.length - 1]);
    }
}
