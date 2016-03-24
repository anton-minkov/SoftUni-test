package myPack;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by anton on 16-3-20.
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A=");
        int number = input.nextInt();
        char char1 = 'a';

        for (int i = 0; i < number; i++) {
            char char2 = char1;

            for (int m = 0; m <= i; m++) {
                System.out.print(char2++ + " ");
            }
            System.out.println();
        }
        for (int i = number; i>0;i--){
            char char2 = char1;
            for (int m = i-1;m>0;m--){
                System.out.print(char2++ + " ");
            }
            System.out.println();
        }
    }
}
