package JavaSyntax;

import java.util.Scanner;


/**
 * Created by anton on 16-3-21.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextFloat();
        double c = input.nextFloat();

        String hexString = Integer.toHexString(a).toUpperCase();
        int binaryInt = Integer.parseInt(Integer.toBinaryString(a));

        String format;
        if (c % 1 == 0) {
            format = "|%-10s|%010d|%10.2f|%-10.3f|";
        } else {
            format = "|%-10s|%010d|%10.2f|%-10.3f|";
        }

        System.out.printf(format, hexString, binaryInt, b, c);
        input.nextInt();
    }
}

