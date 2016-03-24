package JavaSyntax;

import java.util.Scanner;

/**
 * Created by anton on 16-3-21.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a*b;
        System.out.println(area);

    }
}
