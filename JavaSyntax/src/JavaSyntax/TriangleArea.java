package JavaSyntax;

import java.util.Scanner;

/**
 * Created by anton on 16-3-21.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Ax = input.nextInt();

        int Ay = input.nextInt();

        int Bx = input.nextInt();

        int By = input.nextInt();

        int Cx = input.nextInt();

        int Cy = input.nextInt();
        int area = Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2);
        System.out.println(area);
    }
}
